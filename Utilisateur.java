public class user {
    private String nom;
    private String email;
    private String motDePasse;

    public user(String nom, String email, String motDePasse) {
        this.nom = nom;
        this.email = email;
        this.motDePasse = motDePasse;
    }

    public boolean seConnecter(String email, String motDePasse) {
        if (this.email.equals(email) && this.motDePasse.equals(motDePasse)) {
            System.out.println("Connexion réussie !");
            return true;
        } else {
            System.out.println("Erreur de connexion !");
            return false;
        }
    }

    public void afficherProfil() {
        System.out.println("Nom : " + nom + ", Email : " + email);
    }
}


