import java.util.AbstractSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        try{
            AbstractSet<Integer> abset = new TreeSet<>();
            abset.add(23);
            abset.add(21);
            abset.add(30);
            abset.add(11);
            abset.add(19987);
            abset.add(999);
            abset.add(2);
            abset.add(15);
            abset.add(15);

            System.out.println("Zbiór abstrakcyjny: " + abset);

            char t = 'l';
            System.out.println(t);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
