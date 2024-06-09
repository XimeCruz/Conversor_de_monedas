package com.one_oracle;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

public class ConsultaConversor {
    private static final String API_KEY = "8878ee1f7d4057cbbd03c50f";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";
    private Map<String, Double> tasasDeCambio;

    public ConsultaConversor() {
        tasasDeCambio = new HashMap<>();
    }

    public void obtenerTasasDeCambio(String base) throws IOException, InterruptedException {
        String url = BASE_URL + API_KEY + "/latest/" + base;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(response.body(), JsonObject.class);
        JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");

        for (Map.Entry<String, Double> entry : tasasDeCambio.entrySet()) {
            String currency = entry.getKey();
            if (conversionRates.has(currency)) {
                tasasDeCambio.put(currency, conversionRates.get(currency).getAsDouble());
            }
        }
    }

    public double obtenerTasaDeCambio(String base, String objetivo) {
        if (tasasDeCambio.containsKey(base) && tasasDeCambio.containsKey(objetivo)) {
            double tasaBase = tasasDeCambio.get(base);
            double tasaObjetivo = tasasDeCambio.get(objetivo);
            return tasaObjetivo / tasaBase;
        }
        return 0;
    }

    public void agregarMoneda(String codigo) {
        tasasDeCambio.put(codigo, 0.0);
    }
}

