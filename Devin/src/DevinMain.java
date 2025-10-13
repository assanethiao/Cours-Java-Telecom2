import java.util.Scanner;

public class DevinMain {
    public static void main(String[] args) {
        // Définition des bornes
        int Min = 0;
        int Max = 99;

        // Génération d'un nombre aléatoire entre Min et Max
        int nombreAleatoire = Min + (int) (Math.random() * ((Max - Min) + 1));

        // Scanner pour lire les entrées utilisateur
        Scanner sc = new Scanner(System.in);

        int essais = 0;
        int maxEssais = 6;
        int nombreSaisi = -1;

        System.out.println("Bienvenue au jeu du Devin !");
        System.out.println("Devinez un nombre entre " + Min + " et " + Max + ".");
        System.out.println("Vous avez " + maxEssais + " essais maximum.");

        // Boucle de jeu
        while (essais < maxEssais && nombreSaisi != nombreAleatoire) {
            System.out.print("Veuillez saisir un nombre : ");
            nombreSaisi = sc.nextInt();
            essais++;

            if (nombreSaisi < nombreAleatoire) {
                System.out.println("Trop petit !");
            } else if (nombreSaisi > nombreAleatoire) {
                System.out.println("Trop grand !");
            } else {
                System.out.println("Bravo ! Vous avez trouvé le nombre en " + essais + " essais.");
                break;
            }

            if (essais == maxEssais && nombreSaisi != nombreAleatoire) {
                System.out.println("Vous avez atteint le nombre maximum d'essais. Le nombre était : " + nombreAleatoire);
            }
        }

        sc.close();
    }
}
