import java.util.Scanner;

public class Ovning2 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
//	Skapar variabler!
		
	String f�rNamn;
	String mellanNamn;
	String efterNamn;
	
// Initierar variabler!	
//	f�rNamn = "Carl";
//	mellanNamn = "Anton";
//	efterNamn = "Carlton";
		
	Scanner one = new Scanner(System.in);
	System.out.println("Skriv in ditt f�rnamn:");
	f�rNamn = one.next();
	
	Scanner two = new Scanner(System.in);
	System.out.println("Skriv in ditt mellannamn:");
	mellanNamn = two.next();
	
	Scanner three = new Scanner(System.in);
	System.out.println("Skriv in ditt efternamn:");
	efterNamn = three.next();
	
	System.out.println("Ditt Namn �r: " + f�rNamn +" "+ mellanNamn +" "+ efterNamn  +"\n");
//	sc.close();

	
	// skriver ut Namn.
	
/*	System.out.println("Skriv ut namn p� olika rad: ");
	System.out.println();
	System.out.println("Ditt f�rnamn �r: " + f�rNamn +"\n"+"Ditt mellannamn �r: " + mellanNamn +"\n"+ "Ditt efternamn �r: " + efterNamn);
	System.out.println();	
	System.out.println("Skriv ut namn p� samma rad: ");
	System.out.println("");
	System.out.println("Ditt Namn �r: " + f�rNamn +" "+ mellanNamn +" "+ efterNamn  +"\n");
	

	//Switch
	 
	public class StringSwitchDemo {

    public static int getMonthNumber(String month) {

        int monthNumber = 0;

        if (month == null) {
            return monthNumber;
        }

        switch (month.toLowerCase()) {
            case "january":
                monthNumber = 1;
                break;
            case "february":
                monthNumber = 2;
                break;
            case "march":
                monthNumber = 3;
                break;
            case "april":
                monthNumber = 4;
                break;
            case "may":
                monthNumber = 5;
                break;
            case "june":
                monthNumber = 6;
                break;
            case "july":
                monthNumber = 7;
                break;
            case "august":
                monthNumber = 8;
                break;
            case "september":
                monthNumber = 9;
                break;
            case "october":
                monthNumber = 10;
                break;
            case "november":
                monthNumber = 11;
                break;
            case "december":
                monthNumber = 12;
                break;
            default: 
                monthNumber = 0;
                break;
        }

        return monthNumber;
    }
  
//Switch2
 * public class SwitchDemo {
    public static void main(String[] args) {

        int month = 8;
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        System.out.println(monthString);
    }
}	 
	
	
	
*/	
// TODO mata in namn fr�n skrivbordet
	
	}

}
