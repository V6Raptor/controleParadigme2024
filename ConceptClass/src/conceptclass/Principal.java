package conceptclass;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Personne> personnes = new ArrayList<>();

        personnes.add(new Membre("Limane", "MANE-COLY", 4, new Date(), "Ancien"));
        personnes.add(new Employe("Ludovic", "MANGENOT", 9, "Adimn Réseau", 2300.0));

        for (int i = 0; i < personnes.size(); i++) {
            Personne personne = personnes.get(i);
            personne.afficherDetails();
            System.out.println();
        }
    }
}
