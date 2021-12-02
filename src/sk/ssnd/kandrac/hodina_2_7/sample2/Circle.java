package sk.ssnd.kandrac.hodina_2_7.sample2;

public class Circle extends Shape {
	
	private double r;
	
	public Circle(double r) {
		this.r = r;
	}
	
	@Override
	public double obvod() {
		return 2 * Math.PI * r;
	}
	
	@Override
	public double obsah() {
		return Math.PI * r * r;
	}
}
