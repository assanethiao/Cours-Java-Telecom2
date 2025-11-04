public class MainJoueur {
    public static void main(String[] args) {
        Equipe realMadrid = new Equipe();

        // --- Effectif du Real Madrid 2024-2025 ---
        realMadrid.addJoueur(new Joueur("Thibaut Courtois", 1));
        realMadrid.addJoueur(new Joueur("Dani Carvajal", 2));
        realMadrid.addJoueur(new Joueur("Éder Militão", 3));
        realMadrid.addJoueur(new Joueur("David Alaba", 4));
        realMadrid.addJoueur(new Joueur("Eduardo Camavinga", 6));
        realMadrid.addJoueur(new Joueur("Jude Bellingham", 5));
        realMadrid.addJoueur(new Joueur("Vinícius Júnior", 7));
        realMadrid.addJoueur(new Joueur("Federico Valverde", 8));
        realMadrid.addJoueur(new Joueur("Kylian Mbappé", 10));
        realMadrid.addJoueur(new Joueur("Rodrygo Goes", 11));
        realMadrid.addJoueur(new Joueur("Andriy Lunin", 13));
        realMadrid.addJoueur(new Joueur("Aurélien Tchouaméni", 14));
        realMadrid.addJoueur(new Joueur("Arda Güler", 15));
        realMadrid.addJoueur(new Joueur("Dani Ceballos", 19));
        realMadrid.addJoueur(new Joueur("Fran García", 20));
        realMadrid.addJoueur(new Joueur("Brahim Díaz", 21));
        realMadrid.addJoueur(new Joueur("Antonio Rüdiger", 22));
        realMadrid.addJoueur(new Joueur("Ferland Mendy", 23));

        

        
        System.out.println(realMadrid);
    }
}
