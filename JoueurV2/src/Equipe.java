
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Equipe {

	private Set<Joueur> equip ;

	public Equipe() {
		this.equip = new TreeSet<Joueur>();
	}

	
	public void addJoueur(Joueur c) {
		equip.add(c);
	}

	
	public void removeJoueur(Joueur c) {
		equip.remove(c);
	}

	
	public boolean isJoueurExist(Joueur c) {
		return equip.contains(c);
	}

	
	public void clear() {
		equip.clear();
	} 

	
	public int getNombreJoueurs() {
		return equip.size();
	}

	
	public Joueur getJoueurByName(String nom) {
		for (Joueur j : equip) {
			if (j.getNom().equalsIgnoreCase(nom)) {
				return j;
			}
		}
		return null; 
	}

	
	public int getMaxAge() {
		int max = 0;
		for (Joueur j : equip) {
			if (j.getAge() > max) {
				max = j.getAge();
			}
		}
		return max;
	}
	
	public double getMoyenneAge() {
	    if (equip.isEmpty()) return 0.0;

	    int somme = 0;
	    for (Joueur j : equip) {
	        somme += j.getAge();
	    }
	    return (double) somme / equip.size();
	}

	
	public double getMedianeAge() {
		if (equip.isEmpty()) return 0.0;

		List<Integer> ages = new ArrayList<>();
		for (Joueur j : equip) {
			ages.add(j.getAge());
		}

		Collections.sort(ages);

		int n = ages.size();
		if (n % 2 == 1) {
			
			return ages.get(n / 2);
		} else {
			return (ages.get(n / 2 - 1) + ages.get(n / 2)) / 2.0;
		}
	}
	
	
		public String toString() {
			String s="";
			for (Joueur c : equip) {
				s += c.toString() +"\n" ;
			}
			return s ;
		}

	}
