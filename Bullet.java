import java.awt.Color;
import java.awt.Graphics;

public class Bullet extends Circle{
	static int RADIUS = 3;
	private double rotation;
	
	public Bullet(Point center, double rotation) {

		super(center, RADIUS); // define RADIUS in Bullet class
		this.rotation = rotation;

		}

	@Override
	public void paint(Graphics brush, Color color) {
		brush.setColor(color);
		brush.fillOval((int) center.x, (int) center.y, radius, radius);
	}

	@Override
	public void move() {
		
		center.x += 5 * Math.cos(Math.toRadians(rotation));
		center.y += 5 * Math.sin(Math.toRadians(rotation));
	}
	public Boolean outOfBounds() {
		Boolean test = false;
	
		if(this.center.x > 800.0 || this.center.x < 0.0 ) {
			test = true;
		}
		if(this.center.y > 600.0 || this.center.y < 0.0) {
			test = true;
		}
		return test;
	}
	public Point getCenter() {
		Point p = new Point(center.x, center.y);
		return p;
		
	}

}
