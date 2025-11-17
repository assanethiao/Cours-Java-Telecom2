package chenille;

import geometrie.Direction;

public class Tete extends Anneau {
    private Direction cap;

    public Tete(int x, int y, Direction cap) {
        super(x, y);
        this.cap = (cap != null) ? cap : Direction.EST;
    }

    @Override
    public void dessiner(char[][] t) {
        if (getX() >= 0 && getX() < t.length && getY() >= 0 && getY() < t[0].length) {
            t[getX()][getY()] = 't';
        }
    }

    public void deplacer(int xMax, int yMax) {
        
        if (getX() <= 0 || getX() >= xMax || getY() <= 0 || getY() >= yMax) {
            cap = cap.inverser(); 
        } else {
            cap = cap.deriver();   
        }

        
        setX(getX() + cap.getDx());
        setY(getY() + cap.getDy());

        
        if (getX() < 0) setX(0);
        if (getX() > xMax) setX(xMax);
        if (getY() < 0) setY(0);
        if (getY() > yMax) setY(yMax);
    }

    public Direction getCap() {
        return cap;
    }
}
