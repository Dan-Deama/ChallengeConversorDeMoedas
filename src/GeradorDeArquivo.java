import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GeradorDeArquivo {

        public void salvaJson (TaxaDeConversao taxaDeConversao1) throws IOException {
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();

            try (FileWriter escrita = new FileWriter("conversoes.json")) {
                escrita.write(gson.toJson(taxaDeConversao1));
                escrita.close();
                System.out.println("Conversão salva com sucesso no arquivo JSON.");
            }

                }

    private static final String CAMINHO_ARQUIVO = "historico_conversoes.txt";

    public static void gravarConversao(String base, String destino, double valorOriginal, double valorConvertido) {
        try (FileWriter fileWriter = new FileWriter(CAMINHO_ARQUIVO, true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {

            LocalDateTime agora = LocalDateTime.now();
            String dataFormatada = agora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

            String registro = String.format("[%s] %.2f [%s] => %.2f [%s]",
                    dataFormatada, valorOriginal, base, valorConvertido, destino);

            printWriter.println(registro);

        } catch (IOException e) {
            System.out.println("Erro ao gravar no arquivo: " + e.getMessage());
            }
        }



    }

