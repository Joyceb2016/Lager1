import java.util.Scanner;

public class CoffeeMachine {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("välj ett nummer");
	//	String val = scan.nextLine();
		
	int val1 = scan.nextInt();
	
	switch(val1){
	case 1:
	System.out.println("Black coffee");
	case 2:
	System.out.println("Hot chocolate");
	case 3:
	System.out.println("Cappucino");
	case 4:
	System.out.println("Latte");
	case 5:
	System.out.println("Tea");
	default:
		System.out.println("Invalid input");
	
	}
}}
/*
		System.out.println("välj ett nummer");
		String val = skannaIn.nextLine();
		
		switch(Valj) { 
		
		case '1':
			System.out.println("Bra val");
		case '2':
			System.out.println("Medel val");
		default:
			System.out.println("Dåligt val");
*/