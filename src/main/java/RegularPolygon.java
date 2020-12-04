public class RegularPolygon extends GeometricObject{
	
	private int n; // number of sides
	private double side; // side length
	private double x;
	private double y;

	/** Constructors */
	/*default values */
	RegularPolygon() {
		n = 3;
		side = 1;
        x = 0;
        y = 0;
	}


	RegularPolygon(int newN, double newSide) {
		n = newN;
		side = newSide;
        x = 0;
        y = 0;
	}


	RegularPolygon(int newN, double newSide, double newX, double newY) {
		n = newN;
		side = newSide;
		x = newX;
		y = newY;
	}

	/** Methods */
	/** Sets new n */
	public void setN(int newN) {
		n = newN;
	}

	/** Sets new length of the side */
	public void setSide(double newSide) {
		side = newSide;
	}

	/** Sets new x-coordinate */
	public void setX(double newX) {
		x = newX;
	}

	/** Sets new y-coordinate */
	public void setY(double newY) {
		y = newY;
	}

	/** Returns n */
	public int getN() {
		return n;
	}

	/** Returns the length of the side */
	public double getSide() {
		return side;
	}

	/** Returns x-coordinate */
	public double getX() {
		return x;
	}

	/** Returns y-coordinate */
	public double getY() {
		return y;
	}

    // perimeter 
    public double getPerimeter() {
		return side * n;
	}

    // area of the polygon
	public double getArea() {
		return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
	}
	
		public String toString() {
		return "RegularPolygon: number of sides = "+n+" side length = "+side;
	}
}
