public class Main {
    public static void main(String[] args) {

        double waganaziemi = 88.4;
        double wagadow = waganaziemi/EPlaneta.ZIEMIA.przeliczGrawitacje();

        for (EPlaneta p:EPlaneta.values())
            System.out.printf("Waga człowieka X na %s wynosi %.2f kg\n",p,p.przeliczWage(wagadow));

    }
}
