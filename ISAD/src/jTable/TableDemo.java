package jTable;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableDemo extends JPanel{

	public TableDemo(){
		super (new GridLayout(1, 0));
		JTable table = new JTable(new MyTableModel());
		
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane);
	}
	
	
	private static void createAndshowGUI(){
		JFrame frame = new JFrame("Table Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TableDemo newContentPane = new TableDemo();
		newContentPane.setOpaque(true);
		frame.setContentPane(newContentPane);
		
		frame.pack();
		frame.setVisible(true);
}


	public static void main(String[] args){
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run(){
				createAndshowGUI();
			}
		});
		
			}
			
	
	
}
