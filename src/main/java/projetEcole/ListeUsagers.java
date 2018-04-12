package projetEcole;

import java.sql.ResultSet;
import java.util.ArrayList;

import BDD.PDO;

public class ListeUsagers {

	private ArrayList<Usager> usagerArraylist = new ArrayList();

	// ----------------------------------------//
	// ------------Methodes--------------------//
	// ----------------------------------------//

	public ListeUsagers() {
		setListUsFromBdd();
	}

	private void setListFormBdd() {
		ResultSet result = PDO.SelectSql("SELECT * FROM Livre");
		System.out.println(result);
		try {
			// permet de verifier l'existance d'une valeur (true or false) si
			// true permet de pointer sur cette valeur
			while (result.next()) {
				livreArraylist.add(new Livre(result.getInt("Id"), result.getString("Titre"), result.getString("Annee"),
						result.getString("Nom_Aut"), result.getString("Prenom_Aut"), result.getString("Editeur")));
				System.out.println(result.getString("Titre"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void addUsager() {

	}

	public Usager getUsager() {

		return null;
	}

}
