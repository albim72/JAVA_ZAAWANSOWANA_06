package marcin.com;

import java.lang.reflect.Method;

public class Marker {
    @MyMarker
    public static void myMeth() {
        Marker ob = new Marker();
        try{
            Method m = ob.getClass().getMethod("myMeth");
            if(m.isAnnotationPresent(MyMarker.class))
                System.out.println("Adnotacja MyMarker melduje się....");
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
