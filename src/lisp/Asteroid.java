package lisp;

public interface Asteroid extends GameObject{
	public double getMass();
	public double getXCenter();
	public double getYCenter();
	public boolean isFree(double x, double y);
}
