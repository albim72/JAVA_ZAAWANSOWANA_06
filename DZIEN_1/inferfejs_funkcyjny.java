import java.security.cert.PolicyNode;
import java.util.ArrayList;

@FunctionalInterface
interface Square{
    int calculate(int x);
}

@FunctionalInterface
interface Calc{
    int calculate(int x, int y);
}

interface Big{
    int calculate(int x, int y,int z);
}

public class Main {
    public static void main(String[] args) {
        int a = 6;
        int h = 12;


        Square s=(int x)->x*x;
        Square q=(int x)->x*x*x;

        Calc mp = (int x, int y)->x+2*y;

        Big bg = (int x, int y, int z) -> x+y-z;


        int ans = s.calculate(a);
        int cube = q.calculate(a);

        int pl = mp.calculate(a,h);
        int bb = bg.calculate(a,h,7);
        System.out.println("Wyniki bezpośrednie:");
        System.out.println(ans);
        System.out.println(cube);
        System.out.println(pl);
        System.out.println(bb);
        System.out.println("_________________________");

        ArrayList<Integer> wyniki = new ArrayList<>();
        wyniki.add(ans);
        wyniki.add(cube);
        wyniki.add(pl);
        wyniki.add(bb);
        wyniki.forEach(n-> System.out.println(n));

        System.out.println("_________________________");

        wyniki.forEach(n->{
            if(n%2==0) System.out.println(n);
        });


    }
}
