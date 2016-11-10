import java.util.Scanner;

public class Scantest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Beräknar medelvärdet av ett antal tal ");
		System.out.println("Ge första tal: ");
		
		double summa = 0;
		int n = 0;
		
		while(sc.hasNextDouble()) {
			
			System.out.print("Ge ett tal:");
			
			summa += sc.nextDouble();
			n++;
		}
		System.out.println("Medelvärdet av dessa " + n + " tal är " + summa/n);
		System.out.println("(Du skrev \"" + sc.next() + "\" för att avbryta");

	}

}
