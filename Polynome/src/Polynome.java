
public class Polynome {
	static final int MAX_COEFF = 8;
	double [] tabCoeff; 
	
	public Polynome() {
		tabCoeff = new double[MAX_COEFF+1];
		for(int i=0; i<MAX_COEFF+1; i++) {
			tabCoeff[i] = 0;
		}
	}
	
	public Polynome(double coef, int degre) {
		this();
		this.tabCoeff[degre] = coef;
	}
	
	public Polynome(double coef) {
		this(coef, 0);
		
	}
	
	public double valeur(double x) {
		double resultat = 0;
		for(int i=0; i<MAX_COEFF+1; i++) {
			resultat += this.tabCoeff[i] * Math.pow(x,i); 
		}
		return resultat;
	}
	
	public Polynome plus(Polynome p) {
		Polynome polynome = new Polynome();
		for(int i=0; i<MAX_COEFF; i++) {
			polynome.tabCoeff[i] = this.tabCoeff[i] + p.tabCoeff[i];
		}
		return polynome;
	}
	
	public Polynome derivee() {
		Polynome derivee = new Polynome();
		for(int i=0; i<MAX_COEFF; i++) {
			derivee.tabCoeff[i] = this.tabCoeff[i] * i;
		}
		return derivee;
	}
	
	@Override
	public String toString() {
	    String s = "";
	    for (int i = MAX_COEFF; i >= 0; i--) {
	        if (tabCoeff[i] != 0) {
	            if (!s.isEmpty() && tabCoeff[i] > 0) {
	                s += " + ";
	            }
	            s += tabCoeff[i] + "x^" + i;
	        }
	    }
	    return s.isEmpty() ? "0" : s;
	}

}
