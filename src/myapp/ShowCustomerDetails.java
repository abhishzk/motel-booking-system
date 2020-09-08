package myapp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class ShowCustomerDetails extends JFrame {

	private JPanel contentPane;

	LinkedList list = new LinkedList();
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private final JTable table = new JTable();

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 * 
	 * @param list
	 */
	public ShowCustomerDetails(LinkedList list2) {
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

		JTextArea textArea = new JTextArea();
		textArea.setForeground(Color.BLACK);
		textArea.setBackground(SystemColor.activeCaption);
		textArea.setFont(new Font("Calibri", Font.PLAIN, 15));
		textArea.setBounds(46, 145, 608, 264);
		contentPane.add(textArea);

		JLabel lblCount = new JLabel(" ");
		lblCount.setForeground(Color.BLACK);
		lblCount.setBackground(SystemColor.activeCaption);
		lblCount.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblCount.setBounds(207, 90, 271, 21);
		contentPane.add(lblCount);

		btnNewButton = new JButton("Show Bookings");
		btnNewButton.setForeground(SystemColor.activeCaption);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int c = list.count();
				lblCount.setText(" Total Bookings " + c);

				list.printlist();

				String res = list.getlist();
				textArea.setText(res);
			}
		});
		btnNewButton.setBounds(261, 34, 166, 27);
		contentPane.add(btnNewButton);

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
		btnNewButton_1.setBounds(61, 88, 89, 23);
		contentPane.add(btnNewButton_1);

		btnNewButton_2 = new JButton("Export");
		btnNewButton_2.setForeground(SystemColor.activeCaption);
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == btnNewButton_2) {
					try {
						PrintWriter out = new PrintWriter(new FileWriter("C:\\eclipse-workspace\\Details.txt"));
						textArea.write(out);
						out.close();
						UIManager.put("OptionPane.background", Color.DARK_GRAY);
						UIManager.put("OptionPane.foreground", SystemColor.activeCaption);
						UIManager.put("Panel.background", Color.DARK_GRAY);

						String text2 = "<html> <span style='color:#99B4D1'> Data Exported! </span> </html>";

						JOptionPane.showMessageDialog(null, text2);
					} catch (IOException e1) {
						System.err.println("Error occurred");
						e1.printStackTrace();
					}
				}
			}
		});
		btnNewButton_2.setBounds(536, 88, 89, 23);
		contentPane.add(btnNewButton_2);
		setSize(720, 485);
		setVisible(true);

	}
}
