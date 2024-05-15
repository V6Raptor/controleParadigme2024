package conceptclass;

public class Livre implements Empruntable {
	String titre;
	String auteur;
	String isbn;
	boolean disponible;

	public Livre(String titre, String auteur, String isbn, boolean disponible) {
		this.titre = titre;
		this.auteur = auteur;
		this.isbn = isbn;
		this.disponible = disponible;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return this.auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public boolean getDisponible() {
		return this.disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public void afficherDetails() {
		// TODO Auto-generated method stub
		System.out.println("Titre: " + titre);
		System.out.println("Auteur: " + disponible);
		System.out.println("Isbn: " + isbn);
		System.out.print("Disponible: " + disponible + '\n');
	}

	@Override
	public void emprunter() {
		// TODO Auto-generated method stub
		if (disponible) {
			disponible = false;
			System.out.println("Le livre \"" + titre + "\" a été emprunté.");
		} else {
			System.out.println("Le livre \"" + titre + "\" n'est pas disponible.");
		}

	}

	@Override
	public void retourner() {
		// TODO Auto-generated method stub
		if (!disponible) {
			disponible = true;
			System.out.println("Le livre \"" + titre + "\" a été retourbné.");
		} else {
			System.out.println("Le livre \"" + titre + "\" est disponible.");
		}
	}
}
