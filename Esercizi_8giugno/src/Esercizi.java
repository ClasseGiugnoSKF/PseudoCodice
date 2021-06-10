
public class Esercizi {

	public static void main(String[] args) {
		//esercizo 1
		double d = 10.5;
			System.out.println((int)d == 10);
			
			
		//esercizio 2
		if(d >= 5 && d <=30) {
			System.out.println("Il valore è compreso tra 5 e 30 (inclusi)");
		} else {
			System.out.println("Il valore non è compreso");
		}
		
		//esercizo 3
		//il risultato resta 7
		
		
		//esercizio 4
		// a = a+1;
		// a += 1;
		// a++;
		
		//esercizio 5
		
		int valore1 = 77;
		int valore2 = 156;
		int valore3 = 35;
		// esercizio con operatore logico
		System.out.println(valore1 != valore3 && valore3 <= valore2 || valore1 == valore3);
		
		//esercizio strutture condizionali
		
		if(valore3 <= valore2 && valore3 >= valore1 ) {
			System.out.println("il valore è compreso tra 77 e 156");
		}else if (valore3 <= valore1 || valore3 >=valore2) {
			System.out.println("Il valore non è compreso tra 77 e 156");
		}
		
		
		
		
		
		
		

	}

}
