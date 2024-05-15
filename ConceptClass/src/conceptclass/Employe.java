package conceptclass;

public class Employe extends Personne {
	String poste;
    double salaire;
	
	public Employe(String nom, String prenom, int id, String poste, double salaire) {
        super(nom, prenom, id);
     // TODO Auto-generated constructor stub
        this.poste = poste;
        this.salaire = salaire;
    }
	
	public String getPoste() {
		return this.poste;
	}

	public void setPoste(String titre) {
		this.poste = titre;
	}

	public double getAuteur() {
		return this.salaire;
	}

	public void setSalaire (double salaire) {
		this.salaire = salaire;
	}

	@Override
	public void afficherDetails() {
		// TODO Auto-generated method stub
		System.out.println("Nom: " + nom);
        System.out.println("Prénom: " + prenom);
        System.out.println("ID: " + id);
        System.out.println("Poste: " + poste);
        System.out.println("Salaire: " + salaire);
	}

}
