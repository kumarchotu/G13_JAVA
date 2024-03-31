package trust1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Eventdetails extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JButton txtBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eventdetails frame = new Eventdetails();
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
	public Eventdetails() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1313, 727);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 30, 1241, 476);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Graduation Day", "Graduation day is celebrated by Final year student in Tech college located in Tadipatri"},
				{"30 th Anniversary Day", "Ramana's marriage anniversary celebrations in his home town "},
				{"Birth Day", "Neelima's Birthday event in S.R.Function Hall in Guntakal"},
				{"Freshers Day", "Freshers party for the First year students in MIT college Dhone"},
				{"Awards Cermony", "On the occasion of Sports day competitions were held in RIT college Anatapur "},
				{"Get Together Party", "Sowmya Shetty School Friends Get Together Party in Kurnool "},
				{"Retairment Function", "Rajendra Prasad Reddy Garu 50 years Police Retairment Event in Gooty"},
				{"Wedding Day", "Chandrakala weds Hari Wedding day Celebrations in "},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Event Name", "Event Description"
			}
		));
		
		txtBack = new JButton("Back");
		txtBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Secondpage lp=new Secondpage();
				lp.show();
				dispose();
			}
		});
		txtBack.setBounds(967, 542, 89, 23);
		contentPane.add(txtBack);
		table.getColumnModel().getColumn(0).setPreferredWidth(143);
		table.getColumnModel().getColumn(1).setPreferredWidth(331);
	}

}
