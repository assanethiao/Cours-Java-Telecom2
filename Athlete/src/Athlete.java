public class Athlete {
	
    private static int cptDossard = 1;  
    private int numeroDossard;
    private boolean temoin;
    private Athlete suivant;
    
    public Athlete() {
        this.numeroDossard = cptDossard;  
        cptDossard++;  
        this.temoin = false;
        this.suivant = null;
    }
    
   public void prendLeTemoin() {
	   if (!this.temoin) {
	        this.temoin = true;
	   	}
	   
	   if (this.suivant != null) {
	        this.passeLeTemoinA(this.suivant);
	    }
   	}
   
   	public void rendLeTemoin() {
       this.temoin = false;
   	}
   
   	public boolean aLeTemoin() {
       return this.temoin;
   	}
   
   	public void passeLeTemoinA(Athlete a) {
        if (this.temoin && !a.aLeTemoin()) {
            this.rendLeTemoin();
            a.prendLeTemoin();
        }
    }
   	
   	void setSuivant(Athlete suivant) {
   		this.suivant = suivant;
   	}
   	
    @Override
    public String toString() {
        return "Athlete num " + this.numeroDossard;
    }
    
}



