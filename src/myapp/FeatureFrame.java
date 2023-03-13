package myapp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class FeatureFrame extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("Motel Booking Features");
	private int index=0;

	private LinkedList list=new LinkedList();

	public FeatureFrame(String s){
		super(s);
		//init_Flight_list();
		Container content=getContentPane();
		Font f=new Font("TimesRoman", Font.BOLD,20);
		getContentPane().setLayout(null);
		getContentPane().setForeground(SystemColor.activeCaption);
		getContentPane().setBackground(Color.DARK_GRAY);
		l0.setBounds(64, 45, 308, 27);
		l0.setFont(new Font("Calibri", Font.BOLD, 25));  
		content.add(l0);
		
		JButton btnNewButton = new JButton("Add Customer Details");
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AddCustomerDetails addbook = new AddCustomerDetails(list);
			}
		});
		btnNewButton.setBounds(85, 136, 250, 27);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Show Customer Details");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ShowCustomerDetails showbook = new ShowCustomerDetails(list);
			}
		});
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnNewButton_1.setBounds(85, 194, 250, 27);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Search Customer Details");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				SearchCustomerDetails searchbook = new SearchCustomerDetails(list);
			}
		});
		btnNewButton_2.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnNewButton_2.setBounds(85, 254, 250, 27);
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setBackground(Color.WHITE);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Delete Customer Details");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DeleteCustomerDetails searchbook = new DeleteCustomerDetails(list);
			}
		});
		btnNewButton_3.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setBounds(85, 311, 250, 27);
		getContentPane().add(btnNewButton_3);
		setSize(441,442);    }

	public FeatureFrame() {
		// TODO Auto-generated constructor stub
		
	}

	public void actionPerformed(ActionEvent e)
	{
		 Object target=e.getSource();
	}
	


}