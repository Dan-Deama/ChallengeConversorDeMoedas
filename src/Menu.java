import java.util.Scanner;

public class Menu {
    public int exibirMenu() {
        Scanner leitura = new Scanner(System.in);
        int opcao;


            System.out.println("*******************************************************\n");
            System.out.println("BEM VINDO AO CONVERSOR DE VALORES!\n");
            System.out.println("Escolha um número de acordo com a conversão de que precisa: ");
            System.out.println("1) REAL >>>>> DÓLAR AMERICANO.");
            System.out.println("2) REAL >>>>> EURO.");
            System.out.println("3) DÓLAR AMERICANO >>>>>> REAL.");
            System.out.println("4) DÓLAR AMERICANO para EURO.");
            System.out.println("5) EURO >>>>> REAL.");
            System.out.println("6) PESO ARGENTINO >>>>> REAL.");
            System.out.println("0) para sair da aplicação");
            System.out.println("*******************************************************\n");

            opcao = leitura.nextInt();


            switch (opcao) {
                case 1:
                    Conversor.setPar("brl/usd/");
                    break;
                case 2:
                    Conversor.setPar("brl/eur/");
                    break;
                case 3:
                    Conversor.setPar("usd/brl/");
                    break;
                case 4:
                    Conversor.setPar("usd/eur/");
                    break;
                case 5:
                    Conversor.setPar("eur/brl/");
                    break;
                case 6:
                    Conversor.setPar("ars/brl/");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Valor inválido, por gentileza tente novamente.");


            } return opcao;
    }
}

