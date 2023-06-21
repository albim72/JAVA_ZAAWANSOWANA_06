package marcin.com;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        URL hp = new URL("http://www.HerbSchildt.com/WhatsNew");
        System.out.println("Protokół: " + hp.getProtocol());
        System.out.println("Port: " + hp.getPort());
        System.out.println("Komputer: " + hp.getHost());
        System.out.println("Plik: " + hp.getFile());
        System.out.println("Pełny adres: "+ hp.toExternalForm());
    }
}
