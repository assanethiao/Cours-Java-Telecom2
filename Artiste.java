import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


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

public class MainArtiste {
	public static ArrayList<Artiste> lire(String nomFichier) throws FileNotFoundException {
		Scanner in = new Scanner(new FileInputStream(nomFichier));
		ArrayList<Artiste> personnes = new ArrayList<Artiste>();

		while (in.hasNextLine()) {
			Scanner ligne = new Scanner(in.nextLine());
			try {
				Artiste p = new Artiste();
				p.setPrenom(ligne.next());
				if (ligne.hasNext())
					p.setNom(ligne.next());
				else
					p.setNom("");
				p.normaliser();
				personnes.add(p);
				ligne.close();
			}
			catch (NoSuchElementException e) {
				// cette exception est levée par la 1ère instruction
				// ligne.next() et nous ignorons les lignes vides
				System.err.println("Erreur de lecture dans le fichier");
			}
		}
		in.close();
		return personnes;
	}

	public static void main(String[] args) {
		Artiste marcel = new Artiste();
		marcel.setPrenom( "    mArCel    ");
		marcel.setNom("\t \n pAgnOl \n");
		System.out.println(marcel);
		marcel.normaliser();
		System.out.println(marcel);
		System.out.println("---------------------------------");

		try {
			// Déclaration d'un tableau dynamique (non alloué) nommé artistes
			ArrayList<Artiste> artistes;
			// Lecture du fichier "artistes.txt" (à la racine du projet) dans le tableau
			artistes = lire("artistes.txt");
			// Nombre d'artistes lus dans le fichier"
			System.out.println(artistes.size() + " personnes lues dans le fichier\n");
			// Affichage du tableau dynamique "artistes"
			for (Artiste p : artistes) System.out.println(p);
		}
		catch (FileNotFoundException e) {
			System.err.println("le fichier est introuvable");
		}
	}
}


