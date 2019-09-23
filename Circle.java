/**
 *
 * 
 */
import java.awt.*;

public abstract class Circle implements Shape {
    protected Point center;
    protected int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public abstract void paint(Graphics brush, Color color);

    public abstract void move();
}
