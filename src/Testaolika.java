
public class Testaolika {
	
	static String s1 = "jossan";
	static String s2 = "Favourite";
	
	double summa;
	static int tal1;
	static int tal2;
	static int summa2 = tal1+tal2;
	static double bas1, hojd1;
	

	public static void main(String[] args) {
		
		 
		for(int j = 0; j < 5; j++) {
			for(int i = 0; i < 10; i++) {
			
			 System.out.print("*");
			}
		
		System.out.println(); 
		}		
	
//�var p� substring() och lenght() metoderna.
		
		tal1 = 1;
		tal2 = 2;
		int diff = tal2 - tal1;
		int summa2 = tal1 + tal2;
		int summa = summa2 + tal1;
		int langd = s1.length();
		String del = s1.substring(1);
		System.out.println("Ditt namn �r: "+ s1+" " + s2);
		System.out.println("Str�ngen �r: "+ langd +" tecken l�ng");
		System.out.println("Det �r: " + del + " tecken kvar");
		System.out.println("Summan �r : " + summa2);
		System.out.println("Skillnaden �r : " + diff);
		System.out.println("Summan �r : " + summa);
		
//R�knar ut triangelns area.
		
/*		
		public double areaTriangel(double bas1 double hojd1) {
		
			return(bas1*hojd1/2);
			
		}
	*/
	}
	}


