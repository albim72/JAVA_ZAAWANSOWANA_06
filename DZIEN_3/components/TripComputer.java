package marcin.com.components;

import marcin.com.cars.Car;

public class TripComputer {
    private Car car;

    public TripComputer() {

    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel(){
        System.out.println("Poziom paliwa: " + this.car.getFuel());
    }

    public void ShowStatus(){
        if(this.car.getEngine().isStarted()){
            System.out.println("Samochód jest uruchomiony");
        }
        else {
            System.out.println("Samochód nie jest uruchomiony!");
        }
    }
}
