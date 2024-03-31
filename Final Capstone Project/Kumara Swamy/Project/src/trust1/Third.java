package trust1;

import java.awt.BorderLayout;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.JLayeredPane;

public class Third extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTable table;
	private JTextField textName;
	private JTextField textAge;
	private JTextField textTypeofEvent;
	private JTextField textTimeofEvent;
	private JTextField textMobile;
	private JTextField textDateofEvent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Third frame = new Third();
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
	public Third() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1313, 687);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 1284, 631);
		panel.setForeground(new Color(0, 0, 0));
		panel.setBackground(new Color(255, 250, 205));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("With Amazingly Creative Events,Make Your Vision Comes True...");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_2.setBounds(164, 15, 859, 87);
		panel.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(36, 113, 424, 419);
		panel_2.setLayout(null);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBackground(new Color(255, 128, 64));
		panel.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(31, 27, 149, 25);
		panel_2.add(lblNewLabel);
		
		JLabel lblFirstname = new JLabel("Age");
		lblFirstname.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFirstname.setBounds(31, 62, 149, 25);
		panel_2.add(lblFirstname);
		
		textName = new JTextField();
		textName.setFont(new Font("Dialog", Font.PLAIN, 15));
		textName.setColumns(10);
		textName.setBounds(177, 27, 218, 25);
		panel_2.add(textName);
		
		textAge = new JTextField();
		textAge.setFont(new Font("Dialog", Font.PLAIN, 15));
		textAge.setColumns(10);
		textAge.setBounds(177, 62, 218, 26);
		panel_2.add(textAge);
		
		textTypeofEvent = new JTextField();
		textTypeofEvent.setFont(new Font("Dialog", Font.PLAIN, 15));
		textTypeofEvent.setColumns(10);
		textTypeofEvent.setBounds(177, 98, 218, 26);
		panel_2.add(textTypeofEvent);
		
		textTimeofEvent = new JTextField();
		textTimeofEvent.setFont(new Font("Dialog", Font.PLAIN, 15));
		textTimeofEvent.setColumns(10);
		textTimeofEvent.setBounds(177, 133, 218, 26);
		panel_2.add(textTimeofEvent);
		
		textMobile = new JTextField();
		textMobile.setFont(new Font("Dialog", Font.PLAIN, 15));
		textMobile.setColumns(10);
		textMobile.setBounds(177, 170, 218, 26);
		panel_2.add(textMobile);
		
		textDateofEvent = new JTextField();
		textDateofEvent.setFont(new Font("Dialog", Font.PLAIN, 15));
		textDateofEvent.setColumns(10);
		textDateofEvent.setBounds(177, 207, 218, 26);
		panel_2.add(textDateofEvent);
		
		final JComboBox cmbGender = new JComboBox();
		cmbGender.setModel(new DefaultComboBoxModel(new String[] {"Select", "Male", "Female", "Others"}));
		cmbGender.setFont(new Font("Tahoma", Font.BOLD, 12));
		cmbGender.setBounds(177, 252, 218, 21);
		panel_2.add(cmbGender);
		
		JLabel lblAddress = new JLabel("Type of Event");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAddress.setBounds(28, 98, 152, 25);
		panel_2.add(lblAddress);
		
		JLabel lblPincode = new JLabel("Date of Event");
		lblPincode.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPincode.setBounds(31, 134, 149, 25);
		panel_2.add(lblPincode);
		
		JLabel lblMobileNo = new JLabel("Time of Event");
		lblMobileNo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMobileNo.setBounds(31, 170, 149, 25);
		panel_2.add(lblMobileNo);
		
		JLabel lblDate = new JLabel("Mobile No");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDate.setBounds(31, 206, 149, 25);
		panel_2.add(lblDate);
		
		JLabel lblProveOfId = new JLabel("Gender ");
		lblProveOfId.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblProveOfId.setBounds(31, 243, 149, 25);
		panel_2.add(lblProveOfId);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(319, 284, 1, 1);
		panel_2.add(layeredPane);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(470, 113, 784, 419);
		panel_4.setLayout(null);
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBackground(new Color(224, 255, 255));
		panel.add(panel_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 765, 399);
		panel_4.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table.setForeground(new Color(0, 0, 0));
		table.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Age", "Type of Event", "Date of Event", "Time of Event", "Mobile No", "Gender"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(53);
		table.getColumnModel().getColumn(3).setPreferredWidth(77);
		table.getColumnModel().getColumn(4).setPreferredWidth(50);
		table.getColumnModel().getColumn(5).setPreferredWidth(87);
		table.getColumnModel().getColumn(6).setPreferredWidth(84);
		scrollPane.setViewportView(table);
		
		JButton button = new JButton("Add Record");
		button.setBounds(81, 572, 153, 33);
		panel.add(button);
		button.setForeground(new Color(230, 230, 250));
		button.setBackground(new Color(106, 90, 205));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 DefaultTableModel model = (DefaultTableModel) table.getModel();
				 model.addRow(new Object[]{			            
				            textName.getText(),
							textAge.getText(),
							textTypeofEvent.getText(),
							textTimeofEvent.getText(),
							textMobile.getText(),
							textDateofEvent.getText(),
							
							cmbGender.getSelectedItem(),
							
		    	   });
			     
			        
			       if (table.getSelectedRow() == -1){
			           if (table.getRowCount() == 0){
			           JOptionPane.showMessageDialog(null, "Update confirmed","Hospital  Book Appointment",
			                   JOptionPane.OK_OPTION);
			           }
			       }   
			     
			        }
			        
			
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton button_2 = new JButton("Delete");
		button_2.setBounds(327, 572, 133, 33);
		panel.add(button_2);
		button_2.setForeground(new Color(230, 230, 250));
		button_2.setBackground(new Color(255, 0, 0));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
		        if(table.getSelectedRow()==-1){
		            if(table.getRowCount()==0){

		                JOptionPane.showMessageDialog(null, "No data to delete ", 
		                        "Patient Book Appointment",JOptionPane.OK_OPTION);
		            }else{

		                JOptionPane.showMessageDialog(null, "Select a row to delete ", 
		                        "Patient Book Appointment",JOptionPane.OK_OPTION);
		            }
		        }else{
		            model.removeRow(table.getSelectedRow());
		        }     
				
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton button_1 = new JButton("Reset");
		button_1.setBounds(569, 572, 133, 33);
		panel.add(button_1);
		button_1.setForeground(new Color(230, 230, 250));
		button_1.setBackground(new Color(128, 0, 0));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textName.setText("");
				textAge.setText("");
				textTypeofEvent.setText("");
				textTimeofEvent.setText("");
				textMobile.setText("");
				textDateofEvent.setText("");
				cmbGender.setSelectedItem("Make a Selection");
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton button_3 = new JButton("Exit");
		button_3.setBounds(1063, 570, 133, 33);
		panel.add(button_3);
		button_3.setForeground(new Color(230, 230, 250));
		button_3.setBackground(new Color(85, 107, 47));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Firstpage Fp=new Firstpage();
				Fp.show();
				dispose();
				
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(153, 50, 204));
		separator.setForeground(new Color(153, 50, 204));
		separator.setBounds(36, 549, 1218, 2);
		panel.add(separator);
	}
}
