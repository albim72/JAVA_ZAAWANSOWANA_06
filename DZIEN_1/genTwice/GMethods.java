
class GenericsType<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

public class GMethods {
    public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2){
        return g1.getT().equals(g2.getT());
    }
        
}
