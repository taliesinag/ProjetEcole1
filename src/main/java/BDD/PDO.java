package BDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PDO {


	private final static String URL = "jdbc:sqlite:test.db";

	private static PDO pdo;

	private Connection connexion;
/**
 * @return PDO
 */
	private PDO() {
		try {
			Class.forName("org.sqlite.JDBC");
			connexion = DriverManager.getConnection(URL);


		} catch (Exception e) {
			// TODO: handle exception
		}

	}
/**
 * 
 * @param sql
 * @return
 */
	private void create(String sql){
		PreparedStatement stmt = null;

		try {
			stmt = connexion.prepareStatement(sql);
			int result = stmt.executeUpdate();
			

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR :"+e);
		}


	}
	
	private ResultSet sql(String sql) {
		PreparedStatement stmt = null;

		try {
			stmt = connexion.prepareStatement(sql);
			ResultSet result = stmt.executeQuery();
			return result;

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR :"+e);
		}

		return null;
	}


	/**
	 * Initialisation du singleton qui gère la connexion à la base de données
	 * sqlite.
	 * 
	 * @return Void
	 */
	public static void init() {
		pdo = new PDO();
		pdo.create("CREATE TABLE IF NOT EXISTS Usager(Id INTEGER PRIMARY KEY Autoincrement,Nom_Usager Varchar (50) NOT NULL);");
		pdo.create("CREATE TABLE IF NOT EXISTS Livre(Id INTEGER PRIMARY KEY Autoincrement,Titre_livre Varchar (25) NOT NULL ,Annee Date NOT NULL ,Nom_Aut Varchar (50) NOT NULL ,Prenom_Aut Varchar (50) ,Nom_Edit Varchar (50) NOT NULL ,Prenom_Edit Varchar (50) NOT NULL);");
		pdo.create("CREATE TABLE Emprunt (Id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, Date_Emprunt NUMERIC NOT NULL, Date_Rendu NUMERIC NOT NULL, Id_Usager INTEGER NOT NULL REFERENCES Livre (Id), Id_Livre INTEGER NOT NULL REFERENCES Livre (Id), FOREIGN KEY (Id_Usager) REFERENCES Usager (Id), FOREIGN KEY (Id_Livre) REFERENCES Livre (Id));");
		//pdo.sql("ALTER TABLE Emprunt ADD CONSTRAINT IF NOT EXIST FK_Emprunt_Id_Usager FOREIGN KEY (Id_Usager) REFERENCES Usager(Id);");
		//pdo.sql("ALTER TABLE Emprunt ADD CONSTRAINT IF NOT EXIST FK_Emprunt_Id_Livre FOREIGN KEY (Id_Livre) REFERENCES Livre(Id);");
	}
	
	/**
	 * 
	 * @param sql
	 * @return
	 */
	public ResultSet Sql(String sql){
		return sql(sql);
	}

}
