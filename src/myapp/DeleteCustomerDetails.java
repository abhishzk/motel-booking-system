package myapp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class DeleteCustomerDetails extends JFrame {

	private JPanel contentPane;

	LinkedList list = new LinkedList();
	private JButton btnNewButton;
	private JButton btnDeleteAllBookings;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 * 
	 * @param list
	 */
	public DeleteCustomerDetails(LinkedList list2) {
		setForeground(SystemColor.activeCaption);
		setBackground(Color.DARK_GRAY);

		list = list2;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 371);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.activeCaption);
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnNewButton = new JButton("Delete Recent Customer Entry");
		btnNewButton.setForeground(SystemColor.activeCaption);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				list.delete_first();

				UIManager.put("OptionPane.background", Color.DARK_GRAY);
				UIManager.put("OptionPane.foreground", SystemColor.activeCaption);
				UIManager.put("Panel.background", Color.DARK_GRAY);

				String text1 = "<html> <span style='color:#99B4D1'> Deleted recent entry!</span> </html>";

				JOptionPane.showMessageDialog(null, text1);
			}
		});
		btnNewButton.setBounds(63, 121, 298, 29);
		contentPane.add(btnNewButton);

		btnDeleteAllBookings = new JButton("Delete All Customer Details");
		btnDeleteAllBookings.setForeground(SystemColor.activeCaption);
		btnDeleteAllBookings.setBackground(Color.DARK_GRAY);
		btnDeleteAllBookings.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnDeleteAllBookings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				list.delete_all();
				UIManager.put("OptionPane.background", Color.DARK_GRAY);
				UIManager.put("OptionPane.foreground", SystemColor.activeCaption);
				UIManager.put("Panel.background", Color.DARK_GRAY);

				String text2 = "<html> <span style='color:#99B4D1'> Deleted all customer details!</span> </html>";

				JOptionPane.showMessageDialog(null, text2);
			}
		});
		btnDeleteAllBookings.setBounds(63, 179, 298, 29);
		contentPane.add(btnDeleteAllBookings);

		btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setForeground(SystemColor.activeCaption);
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FeatureFrame x = new FeatureFrame();
				x.setVisible(false);
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(167, 240, 89, 23);
		contentPane.add(btnNewButton_1);
		setSize(441, 442);
		setVisible(true);
	}
}
