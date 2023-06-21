package marcin.com;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colonies = new ArrayList<>();
        colonies.add("Aerlion");
        colonies.add("Aquria");
        colonies.add("Canceron");
        colonies.add("Caprica");
        colonies.add("Gemenon");
        colonies.add("Leonis");
        colonies.add("Libran");
        colonies.add("Picon");
        colonies.add("Sagittaron");
        colonies.add("Scorpia");
        colonies.add("Tauron");
        colonies.add("Virgomn");

        Iterator myIterator = colonies.iterator();

        System.out.println("\n\nZnaki zodiaku:");
        while (myIterator.hasNext())
            System.out.println("\t\t" + myIterator.next());

    }
}
