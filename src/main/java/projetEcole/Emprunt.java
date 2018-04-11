package projetEcole;

import java.sql.Date;

public class Emprunt {
	private int id_emprunt;
	private Livre livre;
	private Usager usager;
	private Date date_emprunt;
	private Date date_rendu;

	// ----------------------------------------//
	// ------------Getters--and---Setters------//
	// ----------------------------------------//

	public int getId_emprunt() {
		return id_emprunt;
	}

	public void setId_emprunt(int id_emprunt) {
		this.id_emprunt = id_emprunt;
	}

	public Livre getLivre() {
		return livre;
	}

	public void setLivre(Livre livre) {
		this.livre = livre;
	}

	public Usager getUsager() {
		return usager;
	}

	public void setUsager(Usager usager) {
		this.usager = usager;
	}

	// ----------------------------------------//
	// ------------Methods--------------------//
	// ----------------------------------------//

	public Emprunt() {

	}

	public void enregistrer() {

	}

	public void modifier() {

	}

}
