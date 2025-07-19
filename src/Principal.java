import java.io.IOException;

public class Principal {
    public static void main(String[] args) {
        Menu menu = new Menu();

        do {
            int opcao = menu.exibirMenu();

            if (opcao == 0) {
                System.out.println("Encerrando aplicação.");
                break;
            }

            try {
                Conversor conversor = new Conversor();
                TaxaDeConversao taxaDeConversao1 = conversor.solicitaValor();
                System.out.println("Valor: " + Conversor.getValor() + " [" + taxaDeConversao1.base_code() +
                        "] corresponde ao valor de " + taxaDeConversao1.conversion_result() + " [" + taxaDeConversao1.target_code() + "].");

                GeradorDeArquivo.gravarConversao(taxaDeConversao1.base_code(),taxaDeConversao1.target_code(),
                        Conversor.getValor(),taxaDeConversao1.conversion_result());

                GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
                geradorDeArquivo.salvaJson(taxaDeConversao1);

            } catch (RuntimeException | IOException | InterruptedException e) {
                System.out.println(e.getMessage());
                System.out.println("Opa, deu algo errado aqui!");
            }
        } while (true);
    }
}

