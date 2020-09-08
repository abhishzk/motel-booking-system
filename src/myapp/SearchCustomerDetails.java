package myapp;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class SearchCustomerDetails extends JFrame {

	private JPanel contentPane;

	LinkedList list = new LinkedList();
	private JButton btnNewButton;
	private JTextField tfNames;
	private JLabel lblSearchByName;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	/**
	 * Launch the application.
	 */
	 

	/**
	 * Create the frame.
	 * @param list 
	 */
	public SearchCustomerDetails(LinkedList list2) {
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
		
		JTextArea textArea1 = new JTextArea();
		textArea1.setForeground(Color.BLACK);
		textArea1.setBackground(SystemColor.activeCaption);
		textArea1.setFont(new Font("Calibri", Font.PLAIN, 15));
		textArea1.setBounds(52, 145, 598, 244);
		contentPane.add(textArea1);
		
		JLabel lblCount = new JLabel(" ");
		lblCount.setForeground(Color.BLACK);
		lblCount.setBackground(SystemColor.activeCaption);
		lblCount.setBounds(52, 98, 144, 13);
		contentPane.add(lblCount);
		
		tfNames = new JTextField();
		tfNames.setForeground(Color.BLACK);
		tfNames.setBackground(SystemColor.activeCaption);
		tfNames.setFont(new Font("Calibri", Font.PLAIN, 20));
		tfNames.setBounds(224, 38, 343, 27);
		contentPane.add(tfNames);
		tfNames.setColumns(10);
		
		btnNewButton = new JButton("Search By Name");
		btnNewButton.setForeground(SystemColor.activeCaption);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		
 		        
 		     String name = tfNames.getText();
 		    String res =  list.search(name);
 		     if(res.length() > 0) {
 		    	textArea1.setText(res);
 		     }
 		     else {
 		    	textArea1.setText(" No Bookings Found ");
 		     }
			}
		});
		btnNewButton.setBounds(423, 92, 144, 28);
		contentPane.add(btnNewButton);
		
		lblSearchByName = new JLabel("Search by Name :");
		lblSearchByName.setForeground(SystemColor.activeCaption);
		lblSearchByName.setBackground(Color.DARK_GRAY);
		lblSearchByName.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblSearchByName.setBounds(70, 39, 162, 26);
		contentPane.add(lblSearchByName);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setForeground(SystemColor.activeCaption);
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FeatureFrame x = new FeatureFrame(); 
				x.setVisible(false);
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(577, 92, 89, 24);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Clear");
		btnNewButton_2.setForeground(SystemColor.activeCaption);
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfNames.setText("");
				textArea1.setText("");
			}
		});
		btnNewButton_2.setBounds(577, 38, 89, 27);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Search By ID");
		btnNewButton_3.setForeground(SystemColor.activeCaption);
		btnNewButton_3.setBackground(Color.DARK_GRAY);
		btnNewButton_3.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(tfNames.getText());
	 		    String res =  list.searchById(id);
	 		     if(res.length() > 0) {
	 		    	textArea1.setText(res);
	 		     }
	 		     else {
	 		    	textArea1.setText(" No Details Found ");
	 		     }
			}
		});
		btnNewButton_3.setBounds(224, 92, 162, 26);
		contentPane.add(btnNewButton_3);
		setSize(710,478);    setVisible(true);
		
		
		
	}
}
