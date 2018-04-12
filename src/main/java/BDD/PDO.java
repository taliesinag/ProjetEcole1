package BDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PDO {

	private final static String URL = "jdbc:sqlite:C:/JavaWorkspaces/GretaWorkspace/ProjetEcole1/test.db";

	private static PDO pdo;

	private Connection connexion;

	private PDO() {
		try {
			Class.forName("org.sqlite.JDBC");
			connexion = DriverManager.getConnection(URL);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	private ResultSet sql(String sql) {
		PreparedStatement stmt = null;

		try {
			stmt = connexion.prepareStatement(sql);

			return stmt.executeQuery();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

		return null;
	}

	/**
	 * Méthode de Test pour la classe.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		PDO.init();
	}

	/**
	 * Initialisation du singleton qui gère la connexion à la base de données
	 * sqlite.
	 */
	public static void init() {
		pdo = new PDO();
		System.out.println(pdo.sql("CREATE TABLE IF NOT EXISTS Usager(id INTEGER, nom VARCHAR)"));
	}
	
	public static ResultSet Sql(String sql){
		System.out.println(sql);
		return null;
	}

}
