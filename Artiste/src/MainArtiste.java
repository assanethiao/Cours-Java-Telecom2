import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

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
