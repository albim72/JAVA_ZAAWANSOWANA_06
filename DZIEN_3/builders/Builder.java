package marcin.com.builders;

import marcin.com.cars.CarType;
import marcin.com.components.Engine;
import marcin.com.components.GPSNavigator;
import marcin.com.components.Transmission;
import marcin.com.components.TripComputer;
public interface Builder {
    void setCarType(CarType var1);
    void setSeats(int var1);
    void setEngine(Engine var1);
    void setTransmission(Transmission var1);
    void setTripComputer(TripComputer var1);
    void setGPSNavigator(GPSNavigator var1);
}
