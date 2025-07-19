import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Conversor {

    private static String par;
    private static double valor;

    public static double getValor() {
        return valor;
    }

    public static void setValor(double valor) {
        Conversor.valor = valor;
    }

    public static String getPar() {
        return par;
    }

    public static void setPar(String par) {
        Conversor.par = par;
    }

    public TaxaDeConversao solicitaValor () throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o valor a ser convertido: ");
        Conversor.setValor(leitura.nextDouble());


        return converteValor();
    }

    public TaxaDeConversao converteValor() throws IOException, InterruptedException {
        String baseUrl = "https://v6.exchangerate-api.com/v6/941cedc9303b7b58e99410ea/pair/";
        String urlCompleta = baseUrl + getPar() + getValor();
        URI endereco = URI.create(urlCompleta);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Requisição: " + endereco);
        System.out.println("JSON recebido: " + response.body());

        return new Gson().fromJson(response.body(), TaxaDeConversao.class);
    }

}
