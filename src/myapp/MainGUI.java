package myapp;

import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

import login.AdminUser;
import login.AvgUser;
import login.CheckLoginImpl;

class MainGUI extends JFrame implements ActionListener {
	private int index = 0;

	private LinkedList list = new LinkedList();

	protected CheckLoginImpl ch;

	public MainGUI(String s) {
		super(s);
		getContentPane().setForeground(SystemColor.activeCaption);
		setForeground(SystemColor.activeCaption);
		getContentPane().setBackground(Color.DARK_GRAY);
		setBackground(Color.DARK_GRAY);
		// init_Flight_list();
		Container content = getContentPane();
		getContentPane().setLayout(null);

		JLabel lblWelcomeToHotel = new JLabel("Motel Booking System");
		lblWelcomeToHotel.setForeground(SystemColor.activeCaption);
		lblWelcomeToHotel.setBackground(Color.DARK_GRAY);
		lblWelcomeToHotel.setBounds(136, 51, 234, 39);
		lblWelcomeToHotel.setFont(new Font("Calibri", Font.BOLD, 25));
		getContentPane().add(lblWelcomeToHotel);
		Font f = new Font("TimesRoman", Font.BOLD, 20);
		setSize(526, 427);
		setVisible(true);

		JTextField uName = new JTextField();
		uName.setForeground(Color.BLACK);
		uName.setBackground(SystemColor.activeCaption);
		uName.setBounds(96, 187, 86, 20);
		getContentPane().add(uName);
		uName.setColumns(10);

		JTextField pass = new JTextField();
		pass.setForeground(Color.BLACK);
		pass.setBackground(SystemColor.activeCaption);
		pass.setBounds(302, 187, 86, 20);
		getContentPane().add(pass);
		pass.setColumns(10);

		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setForeground(SystemColor.activeCaption);
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setBounds(103, 144, 79, 20);
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 16));
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setForeground(SystemColor.activeCaption);
		lblNewLabel_1.setBackground(Color.DARK_GRAY);
		lblNewLabel_1.setBounds(302, 144, 68, 20);
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 16));
		getContentPane().add(lblNewLabel_1);

		JButton btnNewButton = new JButton("Continue");
		btnNewButton.setForeground(SystemColor.activeCaption);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setBounds(163, 229, 156, 39);
		btnNewButton.setFont(new Font("Calisto MT", Font.PLAIN, 20));
		getContentPane().add(btnNewButton);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (uName.getText().equals("Admin") && pass.getText().equals("Admin")) {
					ch = new AdminUser();
					UIManager.put("OptionPane.background",  Color.DARK_GRAY);
					UIManager.put("OptionPane.foreground",  SystemColor.activeCaption);
					UIManager.put("Panel.background", Color.DARK_GRAY );
//					 String text = "<html>The Quick <span style='color:green'>brown</span> fox</html>";
					 String text = "<html> <span style='color:#99B4D1'> Admin User</span> </html>";

					JOptionPane.showMessageDialog(null, text);
					
					launchFrame();

				} else if (uName.getText().equals("User") && pass.getText().equals("User")) {
					ch = new AvgUser();
					UIManager.put("OptionPane.background",  Color.DARK_GRAY);
					UIManager.put("OptionPane.foreground",  SystemColor.activeCaption);
					UIManager.put("Panel.background", Color.DARK_GRAY );
//					 
					 String text2 = "<html> <span style='color:#99B4D1'> Average User</span> </html>";
					JOptionPane.showMessageDialog(null, text2 );
					launchFrame();
				}

				else {
					UIManager.put("OptionPane.background",  Color.DARK_GRAY);
					UIManager.put("OptionPane.foreground",  SystemColor.activeCaption);
					UIManager.put("Panel.background", Color.DARK_GRAY );
//					 
					 String text3 = "<html> <span style='color:#99B4D1'> Wrong Credentials	</span> </html>";
					JOptionPane.showMessageDialog(null, text3 );
					
				}
			
			}
		});
	}

	protected void launchFrame() {
		// TODO Auto-generated method stub
		FeatureFrame f = new FeatureFrame("");

		f.setVisible(true);
		dispose();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		this.setVisible(false);
	}
}
