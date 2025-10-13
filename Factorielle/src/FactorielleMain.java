
public class FactorielleMain {

	public static void main(String[] args) {
		Factorielle fact = new Factorielle() ;
		
		int [] nombres = {10,13,25,1000} ;
		// Un exemple d'appel
		System.out.println("Factorielle de 13 = " +fact.bigIntFactorielle(nombres[1])) ;
		
	}

}
