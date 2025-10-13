
public class Bissextile {
    public boolean bissextile(int annee) {
        if (annee % 4 == 0) {
            if (annee % 100 != 0 || annee % 400 == 0) {
                return true;
            }
        }
        return false;
    }
}
