package ihm;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FnLivre extends JInternalFrame {
	private JTextField txtTitre;
	private JTextField txtAnnee;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnLivre;
	private JOptionPane jOptionPane = new JOptionPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			// @Override
			public void run() {
				try {
					FnLivre frame = new FnLivre();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FnLivre() {
		setBounds(200, 200, 950, 500);
		getContentPane().setLayout(null);
		setMaximizable(true);
		setIconifiable(true);
		setResizable(true);
		setClosable(true);
		setSize(400, 300);

		JLabel lblLesLivres = new JLabel("LIVRE");
		lblLesLivres.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblLesLivres.setBounds(130, 11, 55, 14);
		getContentPane().add(lblLesLivres);

		JLabel lbTitre = new JLabel("Titre :");
		lbTitre.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbTitre.setBounds(10, 44, 46, 14);
		getContentPane().add(lbTitre);

		txtTitre = new JTextField();
		txtTitre.setBounds(130, 42, 134, 20);
		getContentPane().add(txtTitre);
		txtTitre.setColumns(10);

		txtAnnee = new JTextField();
		txtAnnee.setColumns(10);
		txtAnnee.setBounds(130, 83, 134, 20);
		getContentPane().add(txtAnnee);

		JLabel lblAnnee = new JLabel("Annee:");
		lblAnnee.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAnnee.setBounds(10, 85, 71, 14);
		getContentPane().add(lblAnnee);

		JLabel lblEdition = new JLabel("Edition :");
		lblEdition.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEdition.setBounds(10, 125, 71, 14);
		getContentPane().add(lblEdition);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(130, 123, 134, 20);
		getContentPane().add(textField);

		JLabel lblNomAuteur = new JLabel("Nom Auteur :");
		lblNomAuteur.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNomAuteur.setBounds(10, 168, 95, 14);
		getContentPane().add(lblNomAuteur);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(130, 166, 134, 20);
		getContentPane().add(textField_1);

		JLabel lblPrenomAuteur = new JLabel("Prenom Auteur :");
		lblPrenomAuteur.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrenomAuteur.setBounds(10, 207, 110, 14);
		getContentPane().add(lblPrenomAuteur);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(130, 205, 134, 20);
		getContentPane().add(textField_2);

		btnLivre = new JButton("Enregistrement");
		btnLivre.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLivre.setBounds(130, 236, 134, 23);
		validationLivre();
		getContentPane().add(btnLivre);

	}

	private void validationLivre() {
		btnLivre.addActionListener(new ActionListener() {
			// @Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Emprunt Valider");
			}
		});
	}
}
