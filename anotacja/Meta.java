package marcin.com;

import java.lang.reflect.Method;

public class Meta {
    @MyAnno(str="Przykładowa annotacja", val=100)
    public static void myMeth(){
        Meta ob = new Meta();
        try{
            Class c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
