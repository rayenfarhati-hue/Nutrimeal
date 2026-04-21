public class Main {
    public static void main(String[] args) {

        System.out.println("=== Nutrimeal — Sprint 1 ===");

        
        user user = new user("Ali", "ali@mail.com", "1234");
        user.seConnecter("ali@mail.com", "1234");

        
        Recette r1 = new Recette("Salade chicken healthy", 400, 2, 3, 3.5, 25.0, 10.0);
        Recette r2 = new Recette("Gâteau sucré proteiné", 300, 15, 0.8, 4.0, 25.0, 8.0);
        Recette r3 = new Recette("Smoothie banane protéiné", 250, 12, 1.0, 2.5, 20.0, 5.0);
        Recette r4 = new Recette("Poulet grillé avec légumes", 500, 5, 4.0, 6.0, 40.0, 15.0);
        Recette r5 = new Recette("Omelette fitness", 200, 2, 1.5, 3.0, 18.0, 10.0);
        Recette r6 = new Recette("Pâtes complètes au thon", 450, 10, 3.5, 5.0, 30.0, 12.0);
        Recette r7 = new Recette("Yaourt aux fruits healthy", 180, 15, 0.5, 2.0, 8.0, 4.0);
        Recette r8 = new Recette("Burger healthy maison", 550, 8, 5.0, 7.0, 35.0, 20.0);
        Recette r9 = new Recette("Soupe de légumes detox", 120, 6, 0.3, 1.5, 5.0, 2.0);
        Recette r10 = new Recette("Wrap poulet avocat", 400, 7, 3.0, 6.0, 28.0, 18.0);
        Recette r11 = new Recette("Barre énergétique maison", 220, 18, 1.2, 2.8, 10.0, 6.0);
        Recette r12 = new Recette("Riz complet avec saumon", 480, 4, 3.8, 5.5, 32.0, 16.0);
        System.out.println("\n--- Liste des recettes ---");
        r1.afficherDetails();
        r2.afficherDetails();
        r3.afficherDetails();
        r4.afficherDetails();
        r5.afficherDetails();
        r6.afficherDetails();
        r7.afficherDetails();
        r8.afficherDetails();
        r9.afficherDetails();
        r10.afficherDetails();
        r11.afficherDetails();
        r12.afficherDetails();


        System.out.println("\n--- Recettes compatibles diabète ---");
        if (r1.estCompatibleDiabete()) {
            r1.afficherDetails();
        }
        if (r2.estCompatibleDiabete()) {
            r2.afficherDetails();
        }
        if (r3.estCompatibleDiabete()) {
            r3.afficherDetails();
        }
        if (r4.estCompatibleDiabete()) {
            r4.afficherDetails();
        }
        if (r5.estCompatibleDiabete()) {
            r5.afficherDetails();
        }
        if (r6.estCompatibleDiabete()) {
            r6.afficherDetails();
        }
        if (r7.estCompatibleDiabete()) {
            r7.afficherDetails();
        }
        if (r8.estCompatibleDiabete()) {
            r8.afficherDetails();
        }
        if (r9.estCompatibleDiabete()) {
            r9.afficherDetails();
        }
        if (r10.estCompatibleDiabete()) {
            r10.afficherDetails();
        }
        if (r11.estCompatibleDiabete()) {
            r11.afficherDetails();
        }
        if (r12.estCompatibleDiabete()) {
            r12.afficherDetails();
        }

        
        Commande Commande = new Commande(r1, 2);
        System.out.println("\nCommande effectuée !");
    }
}