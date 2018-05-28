package paquetito;

public class Posicion {

	private double x;
	private double y;
	
	public double getY() { return y; }	
	public double getX() { return x; }
	public void setY(double y) { this.y = y; }
	public void setX(double x) { this.x = x; }	
	
	public String toString() {
		return "Posicion [x=" + x + ", y=" + y + "]";
	}
	
	public Posicion(double y) {
		this.x = 0;
		this.y = y;
	}

}
