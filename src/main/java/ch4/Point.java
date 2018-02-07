package ch4;

import java.util.Objects;

public class Point {
	private double x;
	private double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	@Override
	public String toString() {
		return super.toString() + "[x=" + x + ", y="+y+"]";
	}

	public int hashCode(){
		return Objects.hash(this.x,this.y);
	}
}
