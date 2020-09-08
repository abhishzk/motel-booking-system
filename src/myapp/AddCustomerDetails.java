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

public class AddCustomerDetails extends JFrame {

	private JPanel contentPane;
	private JTextField tfName;
	private JTextField tfContact;
	private JTextField tfRoomType;
	private JTextField tfRoomNumber;

	LinkedList list = new LinkedList();
	private JButton btnNewButton;
	private JLabel lblBookingTime;
	private JTextField tfBookingTime;
	private JLabel lblAddDetails;
	private JButton btnBack;
	private JButton btnNewButton_1;
	private JTextField idtf;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 * 
	 * @param list
	 */
	public AddCustomerDetails(LinkedList list2) {
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

		JLabel lblName = new JLabel("Customer Name :");
		lblName.setForeground(SystemColor.activeCaption);
		lblName.setBackground(Color.DARK_GRAY);
		lblName.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblName.setBounds(28, 109, 159, 21);
		contentPane.add(lblName);

		tfName = new JTextField();
		tfName.setForeground(Color.BLACK);
		tfName.setBackground(SystemColor.activeCaption);
		tfName.setFont(new Font("Calibri", Font.PLAIN, 16));
		tfName.setBounds(197, 109, 227, 21);
		contentPane.add(tfName);
		tfName.setColumns(10);

		JLabel lblContactNumber = new JLabel("Contact Number :");
		lblContactNumber.setForeground(SystemColor.activeCaption);
		lblContactNumber.setBackground(Color.DARK_GRAY);
		lblContactNumber.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblContactNumber.setBounds(28, 152, 159, 27);
		contentPane.add(lblContactNumber);

		tfContact = new JTextField();
		tfContact.setForeground(Color.BLACK);
		tfContact.setBackground(SystemColor.activeCaption);
		tfContact.setFont(new Font("Calibri", Font.PLAIN, 16));
		tfContact.setBounds(197, 155, 227, 22);
		contentPane.add(tfContact);
		tfContact.setColumns(10);

		JLabel lblRoomType = new JLabel("Room Type :");
		lblRoomType.setForeground(SystemColor.activeCaption);
		lblRoomType.setBackground(Color.DARK_GRAY);
		lblRoomType.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblRoomType.setBounds(28, 196, 127, 26);
		contentPane.add(lblRoomType);

		tfRoomType = new JTextField();
		tfRoomType.setForeground(Color.BLACK);
		tfRoomType.setBackground(SystemColor.activeCaption);
		tfRoomType.setFont(new Font("Calibri", Font.PLAIN, 16));
		tfRoomType.setBounds(197, 199, 227, 21);
		contentPane.add(tfRoomType);
		tfRoomType.setColumns(10);

		JLabel lblRoomnumber = new JLabel("RoomNumber :");
		lblRoomnumber.setForeground(SystemColor.activeCaption);
		lblRoomnumber.setBackground(Color.DARK_GRAY);
		lblRoomnumber.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblRoomnumber.setBounds(28, 244, 143, 26);
		contentPane.add(lblRoomnumber);

		tfRoomNumber = new JTextField();
		tfRoomNumber.setForeground(Color.BLACK);
		tfRoomNumber.setBackground(SystemColor.activeCaption);
		tfRoomNumber.setFont(new Font("Calibri", Font.PLAIN, 16));
		tfRoomNumber.setBounds(197, 247, 227, 22);
		contentPane.add(tfRoomNumber);
		tfRoomNumber.setColumns(10);

		btnNewButton = new JButton("Add Booking");
		btnNewButton.setForeground(SystemColor.activeCaption);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i = Integer.parseInt(idtf.getText());
				String n = tfName.getText();
				String c = tfContact.getText();
				int rn = Integer.parseInt(tfRoomNumber.getText());
				String rt = tfRoomType.getText();
				String time = tfBookingTime.getText();
				int indexOf = time.indexOf(":");
				String part1 = time.substring(0, indexOf);
				String part2 = time.substring(indexOf + 1);
				int h = Integer.parseInt(part1);
				int m = Integer.parseInt(part2);

				list.insert(i, n, c, h, m, rn, rt);
				UIManager.put("OptionPane.background", Color.DARK_GRAY);
				UIManager.put("OptionPane.foreground", SystemColor.activeCaption);
				UIManager.put("Panel.background", Color.DARK_GRAY);

				String text2 = "<html> <span style='color:#99B4D1'> Customer Details Added</span> </html>";

				JOptionPane.showMessageDialog(null, text2);
			}
		});
		btnNewButton.setBounds(125, 362, 148, 27);
		contentPane.add(btnNewButton);

		lblBookingTime = new JLabel("Booking Time :");
		lblBookingTime.setForeground(SystemColor.activeCaption);
		lblBookingTime.setBackground(Color.DARK_GRAY);
		lblBookingTime.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblBookingTime.setBounds(28, 294, 137, 21);
		contentPane.add(lblBookingTime);

		tfBookingTime = new JTextField();
		tfBookingTime.setForeground(Color.BLACK);
		tfBookingTime.setBackground(SystemColor.activeCaption);
		tfBookingTime.setFont(new Font("Calibri", Font.PLAIN, 16));
		tfBookingTime.setBounds(197, 294, 227, 21);
		contentPane.add(tfBookingTime);
		tfBookingTime.setColumns(10);

		lblAddDetails = new JLabel("Add Details");
		lblAddDetails.setForeground(SystemColor.activeCaption);
		lblAddDetails.setBackground(Color.DARK_GRAY);
		lblAddDetails.setFont(new Font("Calibri", Font.BOLD, 25));
		lblAddDetails.setBounds(213, 22, 143, 35);
		contentPane.add(lblAddDetails);

		btnBack = new JButton("Back");
		btnBack.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnBack.setForeground(SystemColor.activeCaption);
		btnBack.setBackground(Color.DARK_GRAY);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				FeatureFrame x = new FeatureFrame();
				x.setVisible(false);
				setVisible(false);
			}
		});
		btnBack.setBounds(420, 362, 104, 27);
		contentPane.add(btnBack);

		btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_1.setForeground(SystemColor.activeCaption);
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idtf.setText("");
				tfName.setText("");
				tfContact.setText("");
				tfRoomType.setText("");
				tfRoomNumber.setText("");
				tfBookingTime.setText("");
			}
		});
		btnNewButton_1.setBounds(303, 362, 89, 28);
		contentPane.add(btnNewButton_1);

		idtf = new JTextField();
		idtf.setForeground(Color.BLACK);
		idtf.setBackground(SystemColor.activeCaption);
		idtf.setFont(new Font("Calibri", Font.PLAIN, 16));
		idtf.setBounds(197, 68, 227, 20);
		contentPane.add(idtf);
		idtf.setColumns(10);

		JLabel lblId = new JLabel("Customer ID :");
		lblId.setForeground(SystemColor.activeCaption);
		lblId.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblId.setBackground(Color.DARK_GRAY);
		lblId.setBounds(28, 67, 127, 21);
		contentPane.add(lblId);
		setSize(609, 466);
		setVisible(true);
	}
}
