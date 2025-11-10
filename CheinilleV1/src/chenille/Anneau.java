package chenille;

public class Anneau {
    protected int x;
    protected int y;

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

    public void dessiner(char[][] t) {
        if (x >= 0 && x < t.length && y >= 0 && y < t[0].length) {
            t[x][y] = 'a';
        }
    }
}
