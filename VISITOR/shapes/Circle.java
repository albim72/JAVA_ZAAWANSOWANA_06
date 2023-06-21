package marcin.com.shapes;

import marcin.com.visitor.Visitor;
public class Cicrle extends Dot {
    private int radius;

    public Cicrle(int id, int x, int y, int radius) {
        super(id, x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCicle(this);
        
    }
}
