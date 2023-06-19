public class Main {
    public static void main(String[] args) {
        Twice<String,Integer> tw1 = new Twice<>("kolor nr 56",56);
        tw1.print();

        Twice<Boolean,Double> tw2 = new Twice<>(true,5.632);
        tw2.print();

        System.out.println("_______________________________________");

        GenericsType<Double> g1 = new GenericsType<>();
        g1.setT(12.545);

        GenericsType<Double> g2 = new GenericsType<>();
        g2.setT(12.545);

        boolean isEqual = GMethods.<Double>isEqual(g1,g2);

        System.out.println(isEqual);
        isEqual = GMethods.isEqual(g1,g2);

        System.out.println(isEqual);

    }
}
