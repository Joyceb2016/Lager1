import java.util.Scanner;

public class Inskrivning {

	public static void main(String[] args) {
		
		
				Scanner scana = new Scanner(System.in);			
				
//			String förNamn;
//			String mellanNamn;
//			String efterNamn;
				
			System.out.println("Skriv in ditt förnamn:");
			String förNamn = scana.next();
//			System.out.println("Ditt Namn är: " +förNamn);
			
			System.out.println("Skriv in ditt mellannamn:");
			String mellanNamn = scana.next();
			
			System.out.println("Skriv in ditt efternamn:");
			String efterNamn = scana.next();
	
			System.out.println("Ditt Namn är: " + förNamn +" "+ mellanNamn +" "+ efterNamn  +"\n");
//			scana.close();
	
			
	}
		
}

