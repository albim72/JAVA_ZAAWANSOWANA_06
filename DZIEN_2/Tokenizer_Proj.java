package marcin.com;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        StringTokenizer sq1 = new StringTokenizer("Jacek Agata Jan Olga Tomek Benek Jacek Inga");
        StringTokenizer sq2 = new StringTokenizer("Jacek Agata Janusz Olga Tomek Benek Jacek Inka");

        while (sq1.hasMoreTokens())
            System.out.println(sq1.nextToken());
        System.out.println("______________________________________");
        while (sq2.hasMoreTokens())
            System.out.println(sq2.nextToken());
        System.out.println("______________________________________");

        String delim = ", ";
        String imie = "Jacek, Agata, Janusz, Olga, Tomek, Benek, Jacek, Inka";
        StringTokenizer podzielimie = new StringTokenizer(imie,delim);
        int count = podzielimie.countTokens();
        System.out.println("Liczba słów: " + count + "\n");

        for (int i=1;i<=count;i++){
            System.out.println("token [" + i + "]: " + podzielimie.nextToken());
        }
        System.out.println("______________________________________");
        while (podzielimie.hasMoreTokens())
            System.out.println(podzielimie.nextToken());
    }
}
