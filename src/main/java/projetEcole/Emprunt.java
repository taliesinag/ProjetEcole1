package projetEcole;

import BDD.PDO;

public class Emprunt {
	// identifiant unique de l'emprunt
	private int id_emprunt;
	// le livre crée
	private Livre livre;
	// l'usager crée
	private Usager usager;
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
	 * Retourne le livre à emprunter ou à rendre
	 *
	 * @return livre
	 **/
	public Livre getLivre() {
		return livre;
	}

	/**
	 * Méthode permettant de modifier le livre
	 *
	 * @param livre
	 *            contenant le nouveau livre à modifier
	 **/
	public void setLivre(Livre livre) {
		this.livre = livre;
	}

	/**
	 * Retourne l'usager
	 *
	 * @return usager
	 **/
	public Usager getUsager() {
		return usager;
	}

	/**
	 * Méthode permettant de modifier l'usager
	 *
	 * @param usager
	 *            contenant le nouveau usager
	 **/
	public void setUsager(Usager usager) {
		this.usager = usager;
	}

	// ----------------------------------------//
	// ------------Methods--------------------//
	// ----------------------------------------//
	/**
	 * Constructeur d'emprunt qui enregistre le livre emprunté/rendu, l'usager
	 * qui a emprunté/rendu le livre et la date d'emprunt/retour du livre
	 *
	 * @param liv
	 *            le livre emprunté/rendu
	 * @param usag
	 *            l'usagé qui a emprunté/rendu le livre
	 * @param demp
	 *            la date d'emprunt
	 * @param drend
	 *            la date du retour
	 *
	 **/

	public Emprunt(Livre liv, Usager usag, String demp, String drend) {

		livre = liv;
		usager = usag;
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
		String sql = "INSERT INTO emprunt (livre, usager, date_emprunt, date_rendu) VALUES ('" + livre + "','" + usager
				+ "', + date_emprunt, date_rendu)  ";

		PDO.Sql(sql);

		// String sql_recup = "SELECT id_emprunt FROM livre WHERE..... ";
		// PDO.Sql(sql_recup);

		return 0;// retourne l'identifiant du livre qui a été genéré

	}

	public void modifierEmprunt() {
		String sql = "INSERT INTO emprunt 'date_rendu' VALUES 'drend' )";
		PDO.Sql(sql);

	}

}
