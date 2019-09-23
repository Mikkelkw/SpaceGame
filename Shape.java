/**
 * Shape.java
 * 
 * Generic Shape object
 */
import java.awt.*;

public interface Shape {
	public void paint(Graphics brush, Color color);
	
	public void move();
}
