package marcin.com;

public class Main {
    public static void main(String[] args) {

        StringBuffer s  = new StringBuffer("to jest tekst do wyświeltenia [klasa StringBuffer]");
        int p = s.length();
        int q = s.capacity();
        System.out.println("długość s: " + p);
        System.out.println("pojemność s: " + q);

        StringBuffer imie = new StringBuffer("Janusz");
        StringBuffer nazwisko = new StringBuffer("Wiśniewski");
        imie.append("Jacek");
        System.out.println(imie);
        imie.append(nazwisko);
        System.out.println(imie);

        System.out.println("__________________________________");
        StringBuffer miasto = new StringBuffer("KrakówWarszawaŁódźLublin");
        miasto.insert(6,", ");
        miasto.insert(16,", ");
        miasto.insert(22,", ");
        System.out.println(miasto);
        miasto.reverse();
        System.out.println(miasto);

        miasto.delete(0,9);
        System.out.println(miasto);
        miasto.reverse();
        System.out.println(miasto);

        miasto.deleteCharAt(7);
        miasto.replace(4,6,"owianka");
        System.out.println(miasto);
    }
}
