import java.util.Date;

public class Ex1 {
	
	public static void main(String[] args) {
		
		Date now = new Date();
		
		String nuTid = now.toString();
		System.out.println(nuTid);
		
		double gal;
		double lit;
		
		gal = 24;
		lit = gal * 3.7854;
		
		System.out.println(gal + " Gallons is "+ lit + " Liters");
		
		/*			
		for (int i=1; i < 10; i++){
//			for (int j=1; j < 10; ++j){
 * 	
//		System.out.println(i);
//		System.out.println(j);
			}	
//		} 
 */
		
		}
}

/*JOptionPane
import javax.swing.JOptionPane;
	
	public class Ex1 {
	
	public static void main(String[] args) {
 	
 	String skrivInText = JOptionPane.showInputDialog("Ge ett namn: ");
 	System.out.println("Namnet är: " + skrivInText);
 	
 	String skrivInTal = JOptionPane.showInputDialog("Ge ett tal: ");
 	double skrivInTal = Double.parseDouble(inTalString);
 	System.out.println("Numret är: " + skrivInTal);

	}
//while	
	class WhileDemo {
    public static void main(String[] args){
        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }
    }
}
//do while
 
class DoWhileDemo {
    public static void main(String[] args){
        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
    }
}


*/
