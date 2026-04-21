public class Recette {
    private String nom;
    private double calories;
    private double sucre;
    private double sel;
    private double carbs;
    private double protein;
    private double prix;

    public Recette(String nom, double calories, double sucre, double sel, double carbs , double protein,double prix) {
        this.nom = nom;
        this.calories = calories;
        this.carbs = carbs;
        this.protein = protein;
        this.sucre = sucre;
        this.sel = sel;
        this.prix = prix;
    }

    public void afficherDetails() {
        System.out.println("Recette : " + nom);
        System.out.println("Calories : " + calories);
        System.out.println("Sucre : " + sucre + " g");
        System.out.println("Sel : " + sel + " g");
        System.out.println("Carbs : " + carbs + " g");
        System.out.println("Protéines : " + protein + " g");
        System.out.println("Prix : " + prix + " DT");
        System.out.println("--------------------------");
    }

    public boolean estCompatibleDiabete() {
        return sucre < 5;
    }

    public boolean estCompatibleTension() {
        return sel < 1;
    }
}
