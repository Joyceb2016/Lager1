
public class Person {
	
	int �lder;
	int antal�l;
	int antalshorts;
	String namn;

	public static void main(String[] args) {
	
		Person x = new Person();
//		Person x = new Person();
		
		x.�lder = 80;
		x.namn = "Kalle Kaluf";
		x.antal�l = 12;
		x.antalshorts = 5;
		
		
		System.out.println("Personen heter " + x.namn + ", �r " + x.�lder + " �r gammal.");
		System.out.print(x.namn + " dricker " + x.antal�l + " samt " + x.antalshorts + " i veckan.");
		
//		System.out.print(namn + " dricker " + antal�l + " samt " + antalshorts + " i veckan.");
	}

}
