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
        if (x >= 0 && x < t.length && y >= 0 && y < t[0].length) {
            t[x][y] = 't';
        }
    }

    public void deplacer(int xMax, int yMax) {
        
        if (x <= 0 || x >= xMax || y <= 0 || y >= yMax) {
            cap = cap.inverser(); 
        } else {
            cap = cap.deriver();   
        }

        
        x += cap.getDx();
        y += cap.getDy();

        
        if (x < 0) x = 0;
        if (x > xMax) x = xMax;
        if (y < 0) y = 0;
        if (y > yMax) y = yMax;
    }

    public Direction getCap() {
        return cap;
    }
}
