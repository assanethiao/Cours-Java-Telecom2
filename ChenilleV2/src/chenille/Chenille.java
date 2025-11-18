package chenille;

import anneaux.Anneau;
import anneaux.FabriqueAnneau;

public class Chenille {
  private Anneau[] corps; 
  
  public Chenille(int nbAnneaux, int x, int y) {
	    corps = new Anneau[nbAnneaux + 1]; 
	    corps[0] = FabriqueAnneau.creerAnneau(0, x, y); 
	    
	    for (int i = 0; i < nbAnneaux; ++i) {
	        if (i >= nbAnneaux - 3) { // Les 3 derniers segments
	            corps[i + 1] = FabriqueAnneau.creerAnneau(2, x - (i + 1), y); // Code 2: Clignotant
	        } else {
	            corps[i + 1] = FabriqueAnneau.creerAnneau(1, x - (i + 1), y); // Code 1: Standard
	        }
	    }
	}
  
  
  public void deplacer(int xMax, int yMax) {
    
    for (int i = corps.length - 1; i > 0; --i)
 
      corps[i].deplacer(corps[i - 1], xMax, yMax);
      
    
    corps[0].deplacer(null, xMax, yMax);
  }
  
  public void dessiner(char[][] t) {
    for (Anneau a : corps)
      a.dessiner(t);
  }
}