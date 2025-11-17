package chenille;

import geometrie.Direction;

public class Chenille {
    private Tete tete;
    private Anneau[] anneaux;

    public Chenille(int nA, int xTete, int yTete) {
        this.tete = new Tete(xTete, yTete, Direction.EST);
        this.anneaux = new Anneau[nA];
        
        for (int i = 0; i < nA; ++i) {
            anneaux[i] = new Anneau(xTete - (i + 1), yTete);
        }
    }

    public void dessiner(char[][] t) {
        tete.dessiner(t);
        for (Anneau a : anneaux) 
        	a.dessiner(t);
    }

    public void deplacer(int xMax, int yMax) {
        
        for (int i = anneaux.length - 1; i > 0; --i) {
            anneaux[i].placerA(anneaux[i - 1].getX(), anneaux[i - 1].getY());
        }
        
        if (anneaux.length > 0) {
            anneaux[0].placerA(tete.getX(), tete.getY());
        }
        
        tete.deplacer(xMax, yMax);
    }
}
