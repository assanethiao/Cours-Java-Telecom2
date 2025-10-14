import java.util.Random;

public class MatricePleine {
	private int hauteur;
	private int largeur;
	private int [] [] mat;
	
	public MatricePleine(int h, int l) {
		this.hauteur = h;
		this.largeur = l;
		mat = new int [this.hauteur] [this.largeur];
		Random r = new Random();
		for(int i=0; i<this.hauteur; i++) {
			for(int j=0; j<this.largeur; j++) {
				mat[i][j] = r.nextInt(10);
			}
		}
	}
	
	public void set(int x, int y, int valeur) {
		this.mat[x][y] = valeur;
	}
	
	public int get(int x, int y) {
		return this.mat[x][y];
	}
	
	public int getHauteur() {
		return this.hauteur;
	}
	
	public int getLargeur() {
		return this.largeur;
	}
	
	private int getNbNonNuls() {
		int nonNul = 0;
		for(int i=0; i<this.getHauteur(); i++) {
			for(int j=0; j<this.getLargeur(); j++) {
				if(get(i,j) != 0) {
					nonNul +=1;
				}
			}
		}
		
		return nonNul;
	}
	
	public double getTauxRemplissage() {
		double caseRempli = getNbNonNuls();
		double taux = (caseRempli / (this.getHauteur()*this.getLargeur()))*100;
		
		return taux;
	}
	
	public MatricePleine addition(MatricePleine m) {
		MatricePleine newMatrice = new MatricePleine(getHauteur(),getLargeur());
		
		if(this.getHauteur() != m.getHauteur() || this.getLargeur() != m.getLargeur()) {
			return null;
		}
			
		for(int i=0; i<this.getHauteur(); i++) {
			for(int j=0; j<this.getLargeur(); j++) {
				newMatrice.set(i,j, (this.get(i, j) + m.get(i,  j)));
			}
		}
		
		return newMatrice;
	}
	
	public MatricePleine multiplication(MatricePleine m) {
	    if (this.getLargeur() != m.getHauteur()) {
	        return null;  
	    }

	    MatricePleine newMatrice = new MatricePleine(getHauteur(), m.getLargeur());

	    for (int i = 0; i < getHauteur(); i++) {
	        for (int j = 0; j < m.getLargeur(); j++) {
	            int sum = 0; 

	            for (int k = 0; k < this.getLargeur(); k++) {
	                sum += this.get(i, k) * m.get(k, j);
	            }
	            
	            newMatrice.set(i, j, sum);
	        }
	    }

	    return newMatrice;
	}

	
	public String toString() {
		String s = "";
		
		for(int i=0; i<this.getHauteur(); i++) {
			for(int j=0; j<this.getLargeur(); j++) {
				
				s = s + get(i,j) + " ";
				
			}
			s = s + "\n";
		}
		return s;
	}
}
