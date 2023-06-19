import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<>();
        ar.add(new Student(111,"Zenobiusz","ul. Złota 5 Kraków"));
        ar.add(new Student(222,"Olga","ul. Złota 7 Lublin"));
        ar.add(new Student(777,"Jan","ul. Złota 12 Warszawa"));
        ar.add(new Student(999,"Olaf","ul. Złota 53 Toruń"));
        ar.add(new Student(555,"Maria","ul. Złota 112 Gdańsk"));

        System.out.println("Nieposortowane: ");
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }

        System.out.println("______________________________________________");

        Collections.sort(ar,new SortByRoll());
        System.out.println("Posortowane po nr albumu: ");
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }
        System.out.println("______________________________________________");

        Collections.sort(ar,new SortByName());
        System.out.println("Posortowane po imieniu: ");
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }
    }
}
