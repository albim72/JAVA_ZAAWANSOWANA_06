package marcin.com;

public class MultiTh extends Thread{

    public MultiTh() {
    }
    
    public void run(){
        try{
            System.out.println("Wątek " + String.valueOf(Thread.currentThread()) + " pracuje!");
        }catch (Exception var2){
            System.out.println("problem z analizą wątków");
        }
    }
}
