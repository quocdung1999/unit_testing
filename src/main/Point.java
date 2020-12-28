package main;
public class Point {

	private double x;
	private double y;
	public Point(double d,double e)
	{
		this.x = d;
		this.y = e;
		
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
	public double distance(Point other)
	{
		return Math.sqrt((this.x-other.x)*(this.x-other.x)+(this.y-other.y)*(this.y-other.y));
	}
}
