package trust1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Firstpage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Firstpage frame = new Firstpage();
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
	public Firstpage() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 889, 707);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 64, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton txtRegister = new JButton("Register");
		txtRegister.setForeground(new Color(0, 0, 0));
		txtRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Third Tp=new Third();
				Tp.setVisible(true);
			}
		});
		txtRegister.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtRegister.setBackground(new Color(255, 255, 255));
		txtRegister.setBounds(343, 413, 136, 49);
		contentPane.add(txtRegister);
		
		JButton btnNewButton = new JButton("ManagerLogin");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registrationpage Registration=new Registrationpage();
				Registration.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(531, 413, 154, 49);
		contentPane.add(btnNewButton);
		
		JButton txtCancel = new JButton("Cancel");
		txtCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(1);
			}
		});
		txtCancel.setBackground(new Color(255, 255, 255));
		txtCancel.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtCancel.setBounds(734, 413, 131, 49);
		contentPane.add(txtCancel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("OCR A Extended", Font.BOLD, 11));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Dell\\Desktop\\EVENT management.jpeg"));
		lblNewLabel.setBounds(318, 171, 617, 358);
		contentPane.add(lblNewLabel);
		
		
	}

}
