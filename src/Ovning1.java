
public class Ovning1 {

	public static void main(String[] args) {
		
		int i1 = 10;
		int i2 = 5;
		String s1 = "Alla";
		String s2;	
		s2 = "kan";
		
		
		
//Jag tilldelar ny typ.
		
		double d1 = i1;
		double d2 = i2;
		
//Vill j�mf�ra str�ngar.
		
//Typcasting.		

		System.out.println(i1);
		System.out.println(i2);
		System.out.println((double)i1 / (double)i2);
		System.out.println(d1 / d2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 +" "+s2);
		
//N�rmare titt p� inkrement operator.
		i1++;
		++i2;
		
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println(i1++);
		System.out.println(++i2);

//Titta p� arrayer. Jag skapar array av integer med l�ngden 5.
		
		// deklararera array av heltal.
		int[] enArray;
		
		//allocates minne f�r 5 integer.
		enArray = new int[5];
		
		//initiera element.
		enArray[0] = 10;
		enArray[1] = 20;
		enArray[2] = 30;
		enArray[3] = 40;
		enArray[4] = 50;
		
		System.out.println("Element at index 0: " + enArray[0]);
		System.out.println("Element at index 0: " + enArray[4]);
		
		//deklarerar en array av typen integer med 8 element.
		double [] tuArray = {10, 20, 30, 40, 50, 60, 70, 80};
//		tuArray = {10, 20, 30, 40, 50, 60, 70, 80};
		
		System.out.println("Snabbare s�tt att g�ra saker p�: " + tuArray[7]);

//Vill printa alla element i arrayen, testar med en for-sats.
		
		for(int i=0; i < tuArray.length; i++) {
			
			
			System.out.println(tuArray[i]);
			
		}
		
//summera alla element i Arrayen.
		
		double summa = 0;
		for(int i=0; i < tuArray.length; i++) {
			summa = summa + tuArray[i]; //eller summa += tuArray[i];			
		}	
		
		System.out.println("Summan �r: " + summa);
		
//Hitta det st�rsta talet i arrayen
		
		double max = tuArray[0];
		for(int i=0; i < tuArray.length; i++) {
			if (tuArray[i] > max) max = tuArray[i];
		}		
		
		System.out.println("Det st�rsta talet �r: " + max);
		
//Hitta det minsta talet i arrayen
		
				double min = tuArray[0];
/*				for(int i=0; i < tuArray.length; i++) {
					if (tuArray[i] < min) min = tuArray[i];
				}		
				
				System.out.println("Det minsta talet �r: " + min);
 */					
		System.out.println(min);
	}	
			
}
  
