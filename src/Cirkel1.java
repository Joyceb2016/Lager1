
public class Cirkel1 {
	
	final double PI = 3.14;
	double radius;
	double diameter;
	
//Skapa en konstruktor som har ett argument.
	
	Cirkel1(double radius){
		this.radius = radius;
	}

	
	double area() {
		double area = radius*2;
		return area;
	}
	
	double omkrets() {
		double omkrets = diameter*PI;
		return omkrets;
	}
	
	
	
	/*
	public static void main(String[] args) {
		}
*/
}
