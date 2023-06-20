package marcin.com;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Check{
    private void private_Method(){
        System.out.println("Metoda prywatna -> wywołana na zewnątrz!");
    }
    public void printData(){
        System.out.println("Metoda publiczna!");
    }
}

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Check c = new Check();
        c.printData();
        Method m = Check.class.getDeclaredMethod("private_Method");
        m.setAccessible(true);
        m.invoke(c);
    }
}
