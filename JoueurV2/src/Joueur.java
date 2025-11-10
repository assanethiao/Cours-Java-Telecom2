public class Joueur implements Comparable<Joueur>{
	
    private String nom;
    private int age;

    public Joueur(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Joueur : nom = " + nom + ", age = " + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Joueur joueur = (Joueur) obj;
        return age == joueur.age && nom.equals(joueur.nom);
    }

    @Override
    public int hashCode() {
        return nom.hashCode() + age * 31;
    }

    @Override 
	public int compareTo(Joueur o) { // Ordre croissant par couleur
		return (this.nom.compareTo(o.nom)) ;
		
	}
}
