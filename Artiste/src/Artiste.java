
public class Artiste {
	private String prenom;
	private String nom;

	public Artiste() {
		this.prenom = "";
		this.nom = "";
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void normaliser() {
		String str1 = this.prenom.trim().toLowerCase();
		char[] arr1 = str1.toCharArray();
		int index1 = 0;
		arr1[index1] = Character.toUpperCase(arr1[index1]);
		this.prenom = new String(arr1);
		
		String str2 = this.nom.trim().toLowerCase();
		char[] arr2 = str2.toCharArray();
		int index2 = 0;
		arr2[index2] = Character.toUpperCase(arr2[index2]);
		this.nom = new String(arr2);
	}
	
	@Override
	public String toString() {
		String s;
		s = this.prenom + " " + this.nom;
		return s;
	}
}



