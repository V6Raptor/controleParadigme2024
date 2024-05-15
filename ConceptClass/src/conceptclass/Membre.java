package conceptclass;

import java.util.Date;

public class Membre extends Personne {
	Date dateAdhesion;
    String statut;

	public Membre(String nom, String prenom, int id, Date dateAdhesion, String statut) {
		super(nom, prenom, id);
		// TODO Auto-generated constructor stub
		this.dateAdhesion = dateAdhesion;
        this.statut = statut;
	}
	
	public Date getDateAdhesion() {
        return dateAdhesion;
    }

    public void setDateAdhesion(Date dateAdhesion) {
        this.dateAdhesion = dateAdhesion;
    }
	
	public String getStatut() {
		return this.statut;
	}

	public void setStatut(String statut) {
		this.nom = statut;
	}

	@Override
	public void afficherDetails() {
		// TODO Auto-generated method stub
		System.out.println("Nom: " + nom);
        System.out.println("Prenom: " + prenom);
        System.out.println("ID: " + id);
        System.out.println("Date d'adhesion: " + dateAdhesion);
        System.out.print("Statut: " + statut + '\n');
	}

}
