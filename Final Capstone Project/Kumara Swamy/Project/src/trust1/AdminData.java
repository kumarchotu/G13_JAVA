package trust1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminData extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminData frame = new AdminData();
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
	public AdminData() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 696);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 35, 1249, 267);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "Hari Krishna", "26", "Male", "College Function", "Graduation day", "10:00 AM  FN", "24-04-2024"},
				{"2", "Ramana", "45", "Male", "Marriage Day", "30th Anniversary day", "07:00 PM  Night", "15-04-2024"},
				{"3", "Neelima", "12", "Female", "Birth Day Event", "12th Birthday ", "06:00 PM  Evening", "15-04-2024"},
				{"4", "Pallavi", "25", "Female", "College Event", "Freshers day", "09:30 AM   FN", "04-05-2024"},
				{"5", "Rishi", "28", "Male", "Sports day Event", "Awards Cermony", "10:30 AM   FN", "28-04-2024"},
				{"6", "Sowmya Shetty", "32", "Female", "Friends Party", "Get Together Party", "05:00 PM   Evening", "01-04-2024"},
				{"7", "Rajendra Prasad Reddy", "52", "Male", "Retairment Day", "Retairment Function", "07:30 PM   Night", "28-03-2024"},
				{"8", "Chandrakala", "30", "Female", "Marriage Event", "Wedding Day", "11:00 PM  FN", "20-04-2024"},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"S.no", "Name", "Age", "Gender", "Type of Event", "Event Name", "Time of Event", "Date of Event"
			}
		));
		
		JButton txtBack = new JButton("Back");
		txtBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Secondpage lp=new Secondpage();
				lp.show();
				dispose();
			}
		});
		txtBack.setBounds(986, 327, 89, 23);
		contentPane.add(txtBack);
		table.getColumnModel().getColumn(0).setPreferredWidth(30);
		table.getColumnModel().getColumn(1).setPreferredWidth(108);
		table.getColumnModel().getColumn(2).setPreferredWidth(36);
		table.getColumnModel().getColumn(4).setPreferredWidth(115);
		table.getColumnModel().getColumn(5).setPreferredWidth(95);
		table.getColumnModel().getColumn(6).setPreferredWidth(92);
		table.getColumnModel().getColumn(7).setPreferredWidth(96);
	}
}
