import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaModena {
    public Monedas monedas(String moneda1, String moneda2, double cantidad){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/2a1eafd15bffa3585e94df98/pair/"
                +moneda1 + "/" + moneda2 + "/" + cantidad);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontre el tipo de moneda");
        }

    }
}
