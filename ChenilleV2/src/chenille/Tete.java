
package chenille;

import geometrie.Direction;

public class Tete extends Anneau {
  private Direction cap;
  
  public Tete(int x, int y, Direction cap) {
    super(x, y);
    this.cap = cap;
  }

  public Tete(int x, int y) {
    this(x, y, Direction.EST);
  }

  public void déplacer(int xMax, int yMax) {
    if (getX() == 0 || getX() == xMax || 
           getY() == 0 || getY() == yMax)
      cap = cap.inverser();
    else
      cap = cap.deriver();
    placerA(getX() + cap.getDx(), getY() + cap.getDy());
  }

  public char getSymbole() {
    return 't';
  }
}
