import java.util.Scanner;

public class NumberOfGuests {
	static int guests =15;
	public static void main(String[] args) {
	
		if(guests < 10) {
			System.out.println("We are having a friendly gathering.");
		}
		if (guests > 11 && guests < 30 ){
			System.out.println("We are having a party.");
		}
		else if (guests > 31 ) {
			System.out.println("WE ROCK!!!!.");
		}
	}
}
/*
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
*/