package projetEcole;

import BDD.PDO;

public class Usager {

	private int id_usager;
	private String nom_usager;
	private static int nombre_usager = 0;

	// ----------------------------------------//
	// ------------Getters--and---Setters------//
	// ----------------------------------------//

	public int getId_usager() {
		return id_usager;
	}

	public void setId_usager(int id_usager) {
		this.id_usager = id_usager;
	}

	public String getNom_usager() {
		return nom_usager;
	}

	public void setNom_usager(String nom_usager) {
		this.nom_usager = nom_usager;
	}

	// ----------------------------------------//
	// ------------Methods--------------------//
	// ----------------------------------------//
	/**
	 * Constructeur de l'usager qui initialise le nom de l'usager
	 *
	 * @param nu
	 *            nom de l'usager
	 **/

	public Usager(String nu) {

		nom_usager = nu;

		id_usager = enregistrerUsager();
	}

	public int enregistrerUsager() {
		String sql = "INSERT INTO usager 'nom_usager' VALUES 'nu' )";
		PDO.Sql(sql);
		return 0;
	}
}
