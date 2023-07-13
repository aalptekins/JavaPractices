package Point;

public class Point {
	
	double x;
	double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double distanceToCenter() {
        return Math.sqrt(x * x + y * y);
    }
	
	public double distanceTo(Point other) {
        double dx = x - other.getX();
        double dy = y - other.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

	public Point clone() {
        return new Point(x, y);
    }
    
	public void move(char direction, double distance) {
        if (direction == 'x') {
            x += distance;
        } else if (direction == 'y') {
            y += distance;
        }
    }
	
	
}
