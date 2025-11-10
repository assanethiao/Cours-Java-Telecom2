public class MainEquipeLimitee {

    public static void main(String[] args) {
        
        EquipeLimitee equipe = new EquipeLimitee();

       
        equipe.addJoueur(new Joueur("Vini", 7));
        equipe.addJoueur(new Joueur("Mbappe", 10));
        equipe.addJoueur(new Joueur("Jude", 5));
        equipe.addJoueur(new Joueur("Guler", 15));
        equipe.addJoueur(new Joueur("Fede", 8));

        equipe.addJoueur(new Joueur("Militao", 3));

        System.out.println("\n=== Composition de l'équipe ===");
        System.out.println(equipe);

        System.out.println("Nombre de joueurs dans l'équipe : " + equipe.getNombreJoueurs());
    }
}
