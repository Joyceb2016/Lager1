import javax.swing.JOptionPane;

public class Cirkel {
	
	  double pi = 3.14;
	  double r = 4;
	  double d = 8;
	  static double Omkrets;
	  static double Area;
	 
	public static void main(String[] args) {
		
		Cirkel varCirkel = new Cirkel();
		
//		String skrivInR = JOptionPane.showInputDialog("Skriv in radies värde: ");
		
		 Omkrets = varCirkel.pi * varCirkel.d;
		 Area = varCirkel.pi * varCirkel.r*varCirkel.r;
		 
		 System.out.println(Omkrets);
		 System.out.println(Area);

	}

}
