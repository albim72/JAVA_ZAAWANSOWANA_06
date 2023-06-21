package marcin.com;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        URL hp = new URL("http://www.google.com");
        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();
        System.out.println("Metoda żądania: " + hpCon.getRequestMethod());

        System.out.println("Kod odpowiedzi: " + hpCon.getResponseCode());

        System.out.println("Komunikat odpowiedzi: " + hpCon.getResponseMessage());

        Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();
        System.out.println("\nNagłówek: ");
        for(String k :hdrField){
            System.out.println("Klucz: " + k + ", Wartość: " + hdrMap.get(k));

        }

    }
}
