package ST10;

public class Rectangle implements IAreaComputable {
	private double x;
	private double y;
	
	@Override
	public double computeArea(){
		return getX()*getY();
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

	Rectangle(double x, double y) {
		this.x = x;
		this.y = y;
	}
}
