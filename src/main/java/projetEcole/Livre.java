package projetEcole;

public class Livre {

	private int id_livre;
	private String titre_livre;
	private int annee;
	private String nom_auteur;
	private String prenom_auteur;
	private String editeur;

	// ----------------------------------------//
	// ------------Getters--and---Setters------//
	// ----------------------------------------//

	public String getTitre_livre() {
		return titre_livre;
	}

	public void setTitre_livre(String titre_livre) {
		this.titre_livre = titre_livre;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public String getNom_auteur() {
		return nom_auteur;
	}

	public void setNom_auteur(String nom_auteur) {
		this.nom_auteur = nom_auteur;
	}

	public String getPrenom_auteur() {
		return prenom_auteur;
	}

	public void setPrenom_auteur(String prenom_auteur) {
		this.prenom_auteur = prenom_auteur;
	}

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	// ----------------------------------------//
	// ------------Methods--------------------//
	// ----------------------------------------//

	public Livre() {

	}

	public void enregistrer() {

	}

}
