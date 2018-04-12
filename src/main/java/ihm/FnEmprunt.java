package ihm;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FnEmprunt extends JInternalFrame {
	private JTextField txtDateEmprunt;
	private JTextField txtDateRendu;
	private JButton btnEmprunt;
	private JCheckBox chckbxLivre;
	private JLabel lblDateRendu;
	private JLabel lblDateEmprunt;
	private JOptionPane jOptionPane = new JOptionPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			// @Override
			public void run() {
				try {
					FnEmprunt frame = new FnEmprunt();
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
	public FnEmprunt() {
		setBounds(100, 100, 450, 492);
		getContentPane().setLayout(null);
		setBounds(200, 200, 550, 500);
		getContentPane().setLayout(null);
		setMaximizable(true);
		setIconifiable(true);
		setResizable(true);
		setClosable(true);

		JLabel lbLivre = new JLabel("Gestion des Emprunts");
		lbLivre.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbLivre.setBounds(135, 11, 127, 14);
		getContentPane().add(lbLivre);

		JLabel lbcheck = new JLabel("Rendre Livre :");
		lbcheck.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbcheck.setBounds(23, 70, 102, 14);
		getContentPane().add(lbcheck);

		chckbxLivre = new JCheckBox("");

		chckbxLivre.setBounds(223, 70, 31, 23);
		ischekLivre();
		getContentPane().add(chckbxLivre);

		JLabel lblNewLabel = new JLabel("Livres :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(26, 130, 56, 14);
		getContentPane().add(lblNewLabel);

		JComboBox comboBoxLivre = new JComboBox();
		comboBoxLivre.setBounds(135, 128, 127, 20);
		getContentPane().add(comboBoxLivre);

		JComboBox comboBoxUsager = new JComboBox();
		comboBoxUsager.setBounds(135, 170, 127, 20);
		getContentPane().add(comboBoxUsager);

		JLabel lblUsagers = new JLabel("usagers :");
		lblUsagers.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUsagers.setBounds(28, 172, 56, 14);
		getContentPane().add(lblUsagers);

		lblDateEmprunt = new JLabel("Date Emprunt :");
		lblDateEmprunt.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDateEmprunt.setBounds(28, 235, 97, 14);
		getContentPane().add(lblDateEmprunt);

		txtDateEmprunt = new JTextField();
		txtDateEmprunt.setBounds(135, 229, 127, 20);
		getContentPane().add(txtDateEmprunt);
		txtDateEmprunt.setColumns(10);

		lblDateRendu = new JLabel("Date Rendue :");
		lblDateRendu.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDateRendu.setBounds(26, 279, 97, 14);
		lblDateRendu.setEnabled(false);
		getContentPane().add(lblDateRendu);

		txtDateRendu = new JTextField();
		txtDateRendu.setColumns(10);
		txtDateRendu.setBounds(128, 277, 134, 20);
		txtDateRendu.setEnabled(false);
		getContentPane().add(txtDateRendu);

		btnEmprunt = new JButton("Valider Enprunt");
		validerEmprunt(); // valider

		btnEmprunt.setBounds(128, 325, 134, 23);
		getContentPane().add(btnEmprunt);

	}

	private void validerEmprunt() {
		btnEmprunt.addActionListener(new ActionListener() {
			// @Override
			public void actionPerformed(ActionEvent arg0) {
				jOptionPane.showMessageDialog(null, "Emprunt Valider");
			}
		});
	}

	private void ischekLivre() {

		chckbxLivre.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				// System.out.println("Checked? " + chckbxLivre.isSelected());

				if (chckbxLivre.isSelected()) {
					lblDateRendu.setEnabled(true);
					txtDateRendu.setEnabled(true);
					txtDateEmprunt.setEnabled(false);
					lblDateEmprunt.setEnabled(false);

					// Ici le code pour afficher la
				}
			}
		});
	}
}
