import java.util.Scanner;


public class Vecka3ArrEx2 {
	
//	static int[] minArray;
	static Scanner lasIn = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Hur m�nga nummer vill du skapa? ");
		int[] minArray = new int[lasIn.nextInt()];
		 
		 System.out.println("Arrayen kan h�lla "+minArray.length+ " element");
		 
//Summera alla tal i arrayen.
		 
		 int summa = 0;
//		 for(int i : minArray)  {
//			  sum +=i; 
//		 }
// Dessa tv� for-satser �r lika		 
		 for (int i =0; i<minArray.length; i++) {
			 summa +=minArray[i];
		 }
		 
			 System.out.println("Summan �r: "+ summa);
	
	}
}
