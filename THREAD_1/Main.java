package marcin.com;

public class Main {
    public static void main(String[] args) {
        int n = 8;
        int j;
        for(j=0;j<n;++j){
            MultiTh object = new MultiTh();
            object.start();
        }
        System.out.println("czy wykonano wątki?");
        for(j=10;j<=12;++j){
            System.out.println("dane z wątku głównego: " + j*2);
        }
    }
}
