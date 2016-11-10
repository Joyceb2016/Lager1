

public class Vecka3Arr {

	public static void main(String[] args) {
		
		int[] minArray = new int[12];
		String[] minSArray = new String[4];
		
	minArray[0] = 30;
	minArray[1] = 40;
	minArray[2] = 50;
	minArray[3] = 35;
	minArray[4] = 75;
	minArray[5] = 80;
//	minArray[6] = 95;
//	minArray[7] = 105;
//	minArray[8] = 125;
//	minArray[9] = 325;
//	minArray[10] = 12;
//	minArray[11] = 912;	

	minSArray[0] = "Vi";
	minSArray[1] = "kan";
	minSArray[2] = "dansa";
	minSArray[3] = "tango";
		
//	for(String s : minSArray) {
		
	
	System.out.println("Arrayens längd är "+ minSArray.length+ " element\n");
	System.out.println("Skriv ut min array, index 0: " + minSArray[0]);
	System.out.println("Skriv ut min array, index 1: " + minSArray[1]);
	System.out.println("Skriv ut min array, index 2: " + minSArray[2]);
	System.out.println("Skriv ut min array, index 2: " + minSArray[3]);
	System.out.println("");
	
	//} for
	
	System.out.println("Element at index 1: " + minArray[1]);
	System.out.println("Element at index 2: " + minArray[2]);
	System.out.println("Element at index 3: " + minArray[3]);
	System.out.println("Element at index 4: " + minArray[4]);
	System.out.println("Element at index 4: " + minArray[4]);
	System.out.println("Element at index 0: " + minArray[0]);

}
}