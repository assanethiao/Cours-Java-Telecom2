package anneaux;

public class AnneauClignotant extends Anneau {
    
    private boolean estMajuscule = true; 

    public AnneauClignotant(int x, int y) {
        super(x, y);
    }

    @Override
    public char getSymbole() {
        
        char symbole = this.getSymbole();
        char symboleR = ' ';
        
        if (estMajuscule) {
        	symboleR = Character.toUpperCase(symbole);
        } else {
        	symboleR = Character.toLowerCase(symbole);
        }
        estMajuscule = !estMajuscule; 
        
        return symboleR;
    }
     
}