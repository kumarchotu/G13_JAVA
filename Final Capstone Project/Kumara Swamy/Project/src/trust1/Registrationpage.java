package trust1;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Registrationpage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField UserName;
	private JTextField txtWelcomeToEvent;
	private JPasswordField txtPasswordField;
	protected Object buttonGroup;
	private JButton btnNewButton;
	protected String Email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registrationpage frame = new Registrationpage();
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
	public Registrationpage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dell\\Desktop\\Userion.png"));
		setTitle("LoGIn Page");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 904, 725);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel txtUsername = new JLabel("Username");
		txtUsername.setBounds(512, 289, 121, 27);
	    txtUsername.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		txtUsername.setBackground(new Color(192, 192, 192));
	   contentPane.add(txtUsername);
		
		UserName = new JTextField("");
		UserName.setBounds(643, 294, 246, 20);
	  contentPane.add(UserName);
		UserName.setColumns(10);
		
		JLabel txtPassword = new JLabel("Password");
		txtPassword.setBackground(new Color(192, 192, 192));
		txtPassword.setBounds(525, 352, 115, 20);
		txtPassword.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(txtPassword);
		
		JButton txtSubmit = new JButton("Submit");
		txtSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/manager","root","root");
					Statement stmt=con.createStatement();
					String sql="Select * from registration where username='"+UserName.getText()+"'and password='"+txtPasswordField.getText().toString()+"'";
					ResultSet rs=stmt.executeQuery(sql);
					if(rs.next()) {
						JOptionPane.showMessageDialog(null, "Login Sucessfully.....");
						Secondpage lp=new Secondpage();
						lp.show();
						dispose();
					}
					else
						JOptionPane.showMessageDialog(null, "Incorrect UserName or Password......");
					con.close();
				}
				catch(Exception e1) {
					System.out.print(e1);
				}
			}
		});
		txtSubmit.setBackground(new Color(192, 192, 192));
		txtSubmit.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		txtSubmit.setBounds(492, 420, 102, 40);
		contentPane.add(txtSubmit);
		
		
		txtWelcomeToEvent = new JTextField();
		txtWelcomeToEvent.setBackground(new Color(192, 192, 192));
		txtWelcomeToEvent.setFont(new Font("Segoe Script", Font.BOLD, 30));
		txtWelcomeToEvent.setText("                                                       Life is an Event Make it Memorable");
		txtWelcomeToEvent.setBounds(474, 209, 612, 43);
		contentPane.add(txtWelcomeToEvent);
		txtWelcomeToEvent.setColumns(10);
		
		txtPasswordField = new JPasswordField();
		txtPasswordField.setBounds(643, 354, 250, 20);
		contentPane.add(txtPasswordField);
		
		JButton txtReset = new JButton("Reset");
		txtReset.addActionListener(new ActionListener() {
			private JLabel txtPasswordField;

			public void actionPerformed(ActionEvent e) {
				UserName.setText("");
				txtPasswordField.setText("");				
			}
		});
		txtReset.setBackground(new Color(192, 192, 192));
		txtReset.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		txtReset.setBounds(643, 420, 102, 40);
		contentPane.add(txtReset);
		
		btnNewButton = new JButton(" Cancel");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(782, 420, 108, 40);
		contentPane.add(btnNewButton);
	}
}
