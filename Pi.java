package serie0;

public class Pi {

	public static void main(String[] args) {
		
		double piApprocher = 0; // nombre à approcher
		int i = 1; 
		int j = 1; // compteur
		
		while(j <= 1000) { // 1000 termes
			if(j % 2 == 1){
				piApprocher += 1.0 / i; 
			} else {
				piApprocher -= 1.0 / i;
			}
			i += 2; 
			j++;
		}
		
		piApprocher *= 4;
		
		System.out.println("Valeur approchée de Pi : " + piApprocher);
		System.out.println("Valeur de Math.PI     : " + Math.PI);

	}

}
