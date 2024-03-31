package trust1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Secondpage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Secondpage frame = new Secondpage();
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
	public Secondpage() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 901, 711);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrFileHelp = new JTextArea();
		txtrFileHelp.setBounds(0, 0, 1285, 22);
		txtrFileHelp.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtrFileHelp.setText("File    Help");
		contentPane.add(txtrFileHelp);
		
		JTextArea txtrWithAmazinglyCreative = new JTextArea();
		txtrWithAmazinglyCreative.setBounds(0, 23, 1285, 43);
		txtrWithAmazinglyCreative.setFont(new Font("Georgia", Font.BOLD, 33));
		txtrWithAmazinglyCreative.setText("         With Amazingly Creative Events,Your Vision Comes to Life         ");
		contentPane.add(txtrWithAmazinglyCreative);
		
		JButton btnNewButton_1 = new JButton("    Manager inform");
		btnNewButton_1.setBounds(10, 218, 148, 54);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminData Admin=new AdminData();
				Admin.setVisible(true);
			}
		});
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_5 = new JButton("    Back to Login");
		btnNewButton_5.setBounds(10, 395, 148, 54);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registrationpage lp=new Registrationpage();
				lp.show();
				dispose();
			}
		});
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 0, 49, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton txtEventDetails = new JButton("    Event Details");
		txtEventDetails.setBounds(10, 308, 148, 54);
		txtEventDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eventdetails Event=new Eventdetails();
				Event.setVisible(true);;
			}
		});
		contentPane.add(txtEventDetails);
	}
}
