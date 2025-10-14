
public class MainMatricePleine {
	
	public static void main(String[] args) {
		 MatricePleine matrice1 = new MatricePleine(2,2);
	     MatricePleine matrice2 = new MatricePleine(2, 2);
		 

	     System.out.println("Matrice 1:");
	     System.out.println(matrice1);
	        
	     System.out.println("Matrice 2:");
	     System.out.println(matrice2);
		        
	     MatricePleine matriceAddition = matrice1.addition(matrice2);
	        if (matriceAddition != null) {
	            System.out.println("Addition des matrices:");
	            System.out.println(matriceAddition);
	        } else {
	            System.out.println("Les matrices ne peuvent pas être additionnées (dimensions incompatibles).");
	        }
	        
	        // Test de la multiplication de matrices
	        MatricePleine matriceMultiplication = matrice1.multiplication(matrice2);
	        if (matriceMultiplication != null) {
	            System.out.println("Multiplication des matrices:");
	            System.out.println(matriceMultiplication);
	        } else {
	            System.out.println("Les matrices ne peuvent pas être multipliées (dimensions incompatibles).");
	        }
	    }
	
		        

}
