package marcin.com.components;

public class Engine {
    private final double volume;
    private double mileage;
    private boolean started;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }
    
    public void on() {this.started = true;}
    public void off() {this.started = false;}
    
    public boolean isStarted() {return this.started;}
    
    public void go(double mileage){
        if(this.started){
            this.mileage += mileage;
        }
        else {
            System.err.println("Nie możesz jechać bo silnik jest wyłączony!");
        }
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }
}
