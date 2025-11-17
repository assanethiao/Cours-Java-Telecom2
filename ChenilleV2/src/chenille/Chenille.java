
package chenille;

public class Chenille {
  private Tete tete;
  private Anneau[] anneaux;
  
  public Chenille(int nbAnneaux, int x, int y) {
    tete = new Tete(x, y);
    anneaux = new Anneau[nbAnneaux];
    for (int i = 0; i < nbAnneaux; ++i)
      anneaux[i] = new Anneau(x - (i + 1), y);
  }
  
  public void deplacer(int xMax, int yMax) {
    for (int i = anneaux.length - 1; i > 0; --i)
      anneaux[i].placerA(anneaux[i - 1].getX(), anneaux[i - 1].getY());
    anneaux[0].placerA(tete.getX(), tete.getY());
    tete.déplacer(xMax, yMax);
  }
  
  public void dessiner(char[][] t) {
    for (Anneau a : anneaux)
      a.dessiner(t);
    tete.dessiner(t);
  }
}
