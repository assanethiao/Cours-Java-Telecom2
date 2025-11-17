package chenille;

public class Anneau {
    private int x;
    private int y;

    public Anneau(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void placerA(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    
    public void setX(int xx) { this.x = xx; }
    public void setY(int yy) { this.y = yy; }

    public void dessiner(char[][] t) {
        if (x >= 0 && x < t.length && y >= 0 && y < t[0].length) {
            t[x][y] = 'a';
        }
    }
}
