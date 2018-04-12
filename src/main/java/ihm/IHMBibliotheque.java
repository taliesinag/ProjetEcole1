package ihm;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class IHMBibliotheque extends JFrame {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnMenuCrea;
	private JMenuItem mnItemLivre;
	private JMenuItem mntmItemEmp;
	private JMenu mnMenuEmp;
	private JDesktopPane desktopPane;
	private FnLivre fnLivre;
	private FnEmprunt fnEmprunt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			// @Override
			public void run() {
				try {
					IHMBibliotheque frame = new IHMBibliotheque();
					frame.setLocationRelativeTo(null);
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
	public IHMBibliotheque() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 950, 1050);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnMenuCrea = new JMenu("Creation");
		menuBar.add(mnMenuCrea);

		mnItemLivre = new JMenuItem("Livre");
		mnItemLivre.addActionListener(new ActionListener() {
			// @Override
			public void actionPerformed(ActionEvent arg0) {
				fnLivre = new FnLivre();
				desktopPane.add(fnLivre);
				fnLivre.show();

			}
		});
		mnMenuCrea.add(mnItemLivre);

		mnMenuEmp = new JMenu("Emprunts");
		menuBar.add(mnMenuEmp);
		mntmItemEmp = new JMenuItem("Liste");

		mntmItemEmp.addActionListener(new ActionListener() {
			// @Override
			public void actionPerformed(ActionEvent arg0) {

				fnEmprunt = new FnEmprunt();
				desktopPane.add(fnEmprunt);
				fnEmprunt.show();

			}
		});
		mnMenuEmp.add(mntmItemEmp);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, "name_2267486785574958");

	}
}
