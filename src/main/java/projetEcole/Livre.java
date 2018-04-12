package projetEcole;

import BDD.PDO;

public class Livre {

	// identifiant unique du livre
	private int id_livre;
	// titre du livre
	private String titre_livre;
	// annee de l'édition du livre
	private int annee;
	// nom de l'auteur du livre
	private String nom_auteur;
	// prénom de l'auteur du livre
	private String prenom_auteur;
	// l'éditeur du livre
	private String editeur;
	// nombre de livres crées
	private static int nombre_livre = 0;

	// ----------------------------------------//
	// ------------Getters--and---Setters------//
	// ----------------------------------------//

	/**
	 * Retourne l'identifiant du livre
	 *
	 * @return id_livre
	 **/
	public int getId_livre() {
		return id_livre;
	}

	/**
	 * M�thode permettant de modifier l'identifiant d'un livre
	 *
	 * @param id_livre
	 *            contenant le nouvel identifiant du livre � modifier
	 **/
	public void setId_livre(int id_livre) {
		this.id_livre = id_livre;
	}

	/**
	 * Retourne le titre du livre
	 *
	 * @return titre_livre
	 **/
	public String getTitre_livre() {
		return titre_livre;
	}

	/**
	 * M�thode permettant de modifier le titre d'un livre
	 *
	 * @param titre_livre
	 *            contenant le nouveau titre du livre � modifier
	 **/
	public void setTitre_livre(String titre_livre) {
		this.titre_livre = titre_livre;
	}

	/**
	 * Retourne l'ann�e de l'�dition du livre
	 *
	 * @return annee
	 **/
	public int getAnnee() {
		return annee;
	}

	/**
	 * M�thode permettant de modifier l'ann�e de l'�dition d'un livre
	 *
	 * @param annee
	 *            contenant la nouvelle ann�e de l'�dition du livre � modifier
	 **/
	public void setAnnee(int annee) {
		this.annee = annee;
	}

	/**
	 * Retourne le nom de l'auteur
	 *
	 * @return nom_auteur
	 **/
	public String getNom_auteur() {
		return nom_auteur;
	}

	/**
	 * M�thode permettant de modifier le nom de l'auteur d'un livre
	 *
	 * @param nom_auteur
	 *            contenant le nouveau nom de l'auteur du livre � modifier
	 **/
	public void setNom_auteur(String nom_auteur) {
		this.nom_auteur = nom_auteur;
	}

	/**
	 * Retourne le pr�nom de l'auteur
	 *
	 * @return prenom_auteur
	 **/
	public String getPrenom_auteur() {
		return prenom_auteur;
	}

	/**
	 * M�thode permettant de modifier le pr�nom de l'auteur d'un livre
	 *
	 * @param prenom_auteur
	 *            contenant le nouveau prénom de l'auteur du livre � modifier
	 **/
	public void setPrenom_auteur(String prenom_auteur) {
		this.prenom_auteur = prenom_auteur;
	}

	/**
	 * Retourne l'editeur du livre
	 *
	 * @return editeur
	 **/
	public String getEditeur() {
		return editeur;
	}

	/**
	 * M�thode permettant de modifier l'editeur d'un livre
	 *
	 * @param editeur
	 *            contenant le nouveau editeur du livre � modifier
	 **/
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	// ----------------------------------------//
	// ------------Methodes--------------------//
	// ----------------------------------------//

	/**
	 * Constructeur de livre qui initialise le titre et l'année d'éditiion, le
	 * nom et le prénom de l'auteur, ainsi que l'editeur du livre
	 *
	 * @param t
	 *            titre du livre
	 * @param a
	 *            année d'édition du livre
	 * @param na
	 *            nom de l'auteur
	 * @param pa
	 *            prénom de l'auteur
	 * @param edit
	 *            éditeur
	 **/
	public Livre(String t, int a, String na, String pa, String edit) {

		titre_livre = t;
		annee = a;
		nom_auteur = na;
		prenom_auteur = pa;
		editeur = edit;

		id_livre = enregistrerlivre();

	}

	public int enregistrerlivre() {
		/*
		 * generer la requete sql qui perme
		 *
		 * d'enregistrer les donn�es correspondant la méthode SQL prend en
		 * parametre cette requete afin de renvoyer le résultat de la requete
		 */
		String sql = "INSERT INTO Livre ('Titre_livre',Annee,'Nom_aut','Prenom_aut','Editeur') VALUES ('" + titre_livre
				+ "'," + annee + ",'" + nom_auteur + "','" + prenom_auteur + "','" + editeur + "')";
		PDO.Sql(sql);

		// String sql_recup = "SELECT * FROM livre ";
		// PDO.Sql(sql_recup);

		return 0;// retourne l'identifiant du livre qui a été genéré
	}
}
