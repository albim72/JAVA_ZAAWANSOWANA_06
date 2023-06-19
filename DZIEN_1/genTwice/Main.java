public class Main {
    public static void main(String[] args) {
        Twice<String,Integer> tw1 = new Twice<>("kolor nr 56",56);
        tw1.print();

        Twice<Boolean,Double> tw2 = new Twice<>(true,5.632);
        tw2.print();

    }
}
