public class RectangleClass {
	// attributes
	private double length;
	private double width;

	// Constructor

	// GETs and SETs
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getArea() {
		return this.length * this.width;
	}

	public double getPerimeter() {
		return (this.length * 2) + (this.width * 2);
	}

	// Methods
	public boolean isSquare(){
		return (this.length == this.width);
	}
}// End of code