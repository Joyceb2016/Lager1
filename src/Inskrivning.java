import java.util.Scanner;

public class Inskrivning {

	public static void main(String[] args) {
		
		
				Scanner scana = new Scanner(System.in);			
				
//			String f�rNamn;
//			String mellanNamn;
//			String efterNamn;
				
			System.out.println("Skriv in ditt f�rnamn:");
			String f�rNamn = scana.next();
//			System.out.println("Ditt Namn �r: " +f�rNamn);
			
			System.out.println("Skriv in ditt mellannamn:");
			String mellanNamn = scana.next();
			
			System.out.println("Skriv in ditt efternamn:");
			String efterNamn = scana.next();
	
			System.out.println("Ditt Namn �r: " + f�rNamn +" "+ mellanNamn +" "+ efterNamn  +"\n");
//			scana.close();
	
			
	}
		
}

