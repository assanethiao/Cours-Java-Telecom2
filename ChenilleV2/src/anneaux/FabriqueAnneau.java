package anneaux;

public class FabriqueAnneau {
    
    public static Anneau creerAnneau(int num, int x, int y) {
    	if(num==0) {
    		return new Tete(x, y);
    	}
        if(num % 2 == 0) {
        	return new AnneauClignotant(x, y);
        }else {
        	return new Anneau(x, y);
        }      
        
    }
}