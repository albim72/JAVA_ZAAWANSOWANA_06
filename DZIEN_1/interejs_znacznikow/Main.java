public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Klon k = new Klon(101,"Projekt 10101010");
        Klon m = (Klon) k.clone();

        System.out.println(k.i);
        System.out.println(m.i);

        k.i = 600;
        System.out.println(k.i);
        System.out.println(m.i);
    }
}
