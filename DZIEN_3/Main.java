package marcin.com;

import marcin.com.builders.CarBuilder;
import marcin.com.builders.CarManualBuilder;
import marcin.com.cars.Car;
import marcin.com.cars.Manual;
import marcin.com.director.Director;

public class Main {
    public static void main(String[] args) {

        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getResult();
        System.out.println("Zbudowano samochód:\n" + String.valueOf(car.getCarType()));

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSUV(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("Zbudowano ręcznie samochód:\n" + String.valueOf(carManual.print()));
    }
}

