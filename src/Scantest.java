import java.util.Scanner;

public class Scantest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ber�knar medelv�rdet av ett antal tal ");
		System.out.println("Ge f�rsta tal: ");
		
		double summa = 0;
		int n = 0;
		
		while(sc.hasNextDouble()) {
			
			System.out.print("Ge ett tal:");
			
			summa += sc.nextDouble();
			n++;
		}
		System.out.println("Medelv�rdet av dessa " + n + " tal �r " + summa/n);
		System.out.println("(Du skrev \"" + sc.next() + "\" f�r att avbryta");

	}

}
