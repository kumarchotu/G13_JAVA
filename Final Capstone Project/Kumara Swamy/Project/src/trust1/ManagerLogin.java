package trust1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class ManagerLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JTextField email;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerLogin frame = new ManagerLogin();
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
	public ManagerLogin() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1316, 686);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel txtUsername = new JLabel("    Username");
		txtUsername.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtUsername.setBounds(444, 262, 153, 30);
		contentPane.add(txtUsername);
		
		JLabel txtEmail = new JLabel("  Email");
		txtEmail.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtEmail.setBounds(460, 303, 111, 30);
		contentPane.add(txtEmail);
		
		JLabel txtPassword = new JLabel("  Password");
		txtPassword.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtPassword.setBounds(460, 345, 99, 30);
		contentPane.add(txtPassword);
		
		username = new JTextField();
		username.setBounds(633, 270, 205, 20);
		contentPane.add(username);
		username.setColumns(10);
		
		email = new JTextField();
		email.setBounds(633, 311, 205, 20);
		contentPane.add(email);
		email.setColumns(10);
		
		JButton txtSubmit = new JButton("Register");
		txtSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uname,Email,password;
				uname=username.getText();
				Email=email.getText();
				password=passwordField.getText();
				
				if(uname.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter UserName");
				}
				else if(Email.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Email");
				}
				else if(password.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Password");
				}
				else {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					try {
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/manager","root","root");
						String query="insert into registration values(?,?,?)";
						PreparedStatement ps=con.prepareStatement(query);
						ps.setString(1, username.getText());
						ps.setString(2, email.getText());
						ps.setString(3, passwordField.getText());
						int i=ps.executeUpdate();
						JOptionPane.showMessageDialog(txtSubmit, i+"Login SuccessFull..");
						ps.close();
						con.close();
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}
			}
		});
		txtSubmit.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtSubmit.setBounds(480, 411, 117, 40);
		contentPane.add(txtSubmit);
		
		JButton txtCancel = new JButton("Back to Login");
		txtCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registrationpage lp=new Registrationpage();
				lp.show();
				dispose();
			}
		});
		txtCancel.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtCancel.setBounds(754, 411, 180, 40);
		contentPane.add(txtCancel);
		
		JButton txtReset = new JButton("  Reset");
		txtReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				username.setText("");
				email.setText("");
			passwordField.setText("");
				
			}
		});
		txtReset.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtReset.setBounds(623, 416, 99, 35);
		contentPane.add(txtReset);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(633, 352, 205, 22);
		contentPane.add(passwordField);
	}
}
