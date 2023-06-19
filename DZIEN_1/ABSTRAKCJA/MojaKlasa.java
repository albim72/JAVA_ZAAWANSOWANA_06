public class MojaKlasa extends Prototyp {
    int s;
    int k;
    public MojaKlasa(int x, int y, int s) {
        super(x, y);
        this.s = s;

    }

    public MojaKlasa(int x, int y, int s, int k, Dodatek dod) {
        super(x, y);
        this.s = s;
        this.k = k;
        this.dod = dod;
    }

    Dodatek dod = new Dodatek(67);
    @Override
    public int policz() {
        return (x+y)*s;
    }

    @Override
    public void msg() {
        System.out.println("to jest ważna wiadmość!!!");
    }

    public int wynik_dod(){
        return dod.fx();
    }
}
