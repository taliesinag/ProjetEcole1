package projetEcole;

import BDD.PDO;

public class Emprunt {
	// identifiant unique de l'emprunt
	private int id_emprunt;
	// identifiant unique du livre crée
	private int id_livre;
	// identifiant unique de l'usager
	private int id_usager;
	// la date d'emprunt du livre
	private String date_emprunt;
	// la date de retour du livre
	private String date_rendu;

	// ----------------------------------------//
	// ------------Getters--and---Setters------//
	// ----------------------------------------//
	/**
	 * Retourne l'identifiant de l'emprunt
	 *
	 * @return id_emprunt
	 **/
	public int getId_emprunt() {
		return id_emprunt;
	}

	/**
	 * Méthode permettant de modifier l'identifiant de l'emprunt
	 *
	 * @param id_emprunt
	 *            contenant le nouvel identifiant du l'emprunt à modifier
	 **/
	public void setId_emprunt(int id_emprunt) {
		this.id_emprunt = id_emprunt;
	}

	/**
	 * Retourne l'identifiant du livre à emprunter ou à rendre
	 *
	 * @return id_livre
	 **/
	public int getId_livre() {
		return id_livre;
	}

	/**
	 * Méthode permettant de modifier l'identifiant du livre
	 *
	 * @param id_livre
	 *            contenant le nouvel identifiant du livre à modifier
	 **/
	public void setId_livre(int id_livre) {
		this.id_livre = id_livre;
	}

	/**
	 * Retourne l'identifiant de l'usager
	 *
	 * @return id_usager
	 **/
	public int getId_usager() {
		return id_usager;
	}

	/**
	 * Méthode permettant de modifier l'identifiant de l'usager
	 *
	 * @param id_usager
	 *            contenant le nouvel identifiant de l'usager
	 **/
	public void setId_usager(int id_usager) {
		this.id_usager = id_usager;
	}

	// ----------------------------------------//
	// ------------Methodes--------------------//
	// ----------------------------------------//
	/**
	 * Constructeur d'emprunt qui enregistre le livre emprunté/rendu, l'usager
	 * qui a emprunté/rendu le livre et la date d'emprunt/retour du livre
	 *
	 * @param li
	 *            l'identifiant du livre emprunté/rendu
	 * @param us
	 *            l'identifiant de l'usagé qui a emprunté/rendu le livre
	 * @param demp
	 *            la date d'emprunt
	 * @param drend
	 *            la date du retour
	 *
	 **/

	public Emprunt(int li, int us, String demp, String drend) {
		id_livre = li;
		id_usager = us;
		date_emprunt = demp;
		date_rendu = drend;

		id_emprunt = enregistrerEmprunt();
	}

	/*
	 * generer la requete sql qui permet d'enregistrer les donn�es correspondant
	 * à l'emprunt, la méthode SQL prend en parametre cette requete afin de
	 * renvoyer le résultat de la requete
	 */

	public int enregistrerEmprunt() {
		String sql = "INSERT INTO emprunt (Id_Livre, Id_Usager, Date_Emprunt, Date_Rendu) VALUES ('" + getId_livre()
				+ "', '" + getId_usager() + "', '" + date_emprunt + "','" + date_rendu + "') ";

		PDO.Sql(sql);

		// String sql_recup = "SELECT id_emprunt FROM livre WHERE..... ";
		// PDO.Sql(sql_recup);

		return 0;// retourne l'identifiant du livre qui a été genéré

	}

	/*
	 * generer la requete sql qui permet de modifier les donn�es correspondant à
	 * l'emprunt, la méthode SQL prend en parametre cette requete afin de
	 * renvoyer le résultat de la requete
	 */
	public void modifierEmprunt() {
		String sql = "INSERT INTO Emprunt ('Date_Rendu) VALUES ('" + date_rendu + "' ) WHERE (id_livre= id_usager=)";
		PDO.Sql(sql);

	}

}
