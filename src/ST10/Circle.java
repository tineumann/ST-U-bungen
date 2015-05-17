package ST10;

public class Circle implements IAreaComputable {

	private double radius;

	public Circle(double radius){
		this.radius = radius;
	}
	
	@Override
	public double computeArea() {
		return (this.getRadius() * this.getRadius() * Math.PI);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
