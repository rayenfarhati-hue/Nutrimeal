public class Commande {
    private Recette recette;
    private int quantite;

    public Commande(Recette recette, int quantite) {
        this.recette = recette;
        this.quantite = quantite;
    }

    public void afficherCommande() {
        System.out.println("Commande : " + quantite + " x " + recette);
    }
}
