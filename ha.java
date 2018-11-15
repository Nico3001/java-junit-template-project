import java.util.Locale;
import java.util.Scanner;
public class ha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ha test = new ha ();
		
		test.rechnung();
	
		
		
		
	}

	public static int fakul(int n ) {

		int Ergebniss = 1 ;
		int i = 1 ;
		while (i<=n) {
			Ergebniss = Ergebniss * i;
			i++ ;
			
		}
		return ergebniss ;

	}
	public double rechnung () {
		 
		double Lösung  ;
		 try {
			Scanner Eingabe = new Scanner(System.in).useLocale(Locale.ENGLISH);
			System.out.println("Wie groß soll n sein ?");
	        int n = Eingabe.nextInt();
			
			System.out.println("Wie groß soll k sein ?") ;
			int k = Eingabe.nextInt();
			
			int y = n-k ;
			 Lösung = fakul(n) / (fakul(n-k)*fakul(k)) ;
			
			
			System.out.println(Lösung);
			 return  Lösung ;
			
		}
		
			
			catch(Exception e) {
				System.out.println("Fehlerhafte eingabe ");
				double aLösung = 0 ;
				Lösung = aLösung ;
				return Lösung ;
			}
		
			
	}
	
}
	



