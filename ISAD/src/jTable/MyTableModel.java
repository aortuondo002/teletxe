package jTable;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;
import javax.xml.crypto.Data;

public class MyTableModel extends AbstractTableModel{
	private Vector<String> columnNames = new Vector<String>();
	private Vector<Lag> data = new Vector<Lag>();

	public MyTableModel(){
		kargatu();
		hasieratuZutabeIzenak();
	}
	
	public void hasieratuZutabeIzenak(){
		columnNames.add("Izena");
		columnNames.add("Abizena");
		columnNames.add("Kirola");
		columnNames.add("tamaina");
		columnNames.add("baietz");

	}
	
	class Lag {
		 String izena;
		 String abizena;
		 String kirola;
		 Integer tamaina;
		 Boolean baiez;
		
		 
		 	public Lag(String izena, String abizena, String kirola,
		 Integer tamaina, Boolean baiez) {
		super();
		this.izena = izena;
		this.abizena = abizena;
		this.kirola = kirola;
		this.tamaina = tamaina;
		this.baiez = baiez;
		 }
		 
		 	public Object getBalioa(int i) {
		 	switch (i) {
			case 0:
				return izena;
			case 1:
			return abizena;
			case 2:
			return kirola;
			case 3:
			return tamaina;
			case 4:
			return baiez;
			}
		 	return null;
		 }
		 public void insertElementAt(Object value, int i){}
		 
	}

	
	public void kargatu() {
		data.add(new Lag("Kathy", "Smith", "Snowboarding", 5, false));
		data.add(new Lag("John", "Doe", "Rowing", 3, false));
		data.add(new Lag("Sue", "Black", "Knitting", 2, true));
		data.add(new Lag("jane", "white", "speed reading", 20, true));
	}
	
	public int getColumnCount(){
		return columnNames.size();
	}
	
	public int getRowCount() {
		return data.size();
	}

	public String getColumnName(int col) {
		return columnNames.elementAt(col);
	}
	
	public Object getValueAt (int row, int col){
		return data.elementAt(row).getBalioa(col);
	}
	
	public Class getColumnClass(int col){
		return data.elementAt(0).getBalioa(col).getClass();
	}
	
	public boolean isCellEditable(int row, int col){
		if (col<2){
			return false;
		}else{return true;}
	}
	
	public void setValueAt(Object value, int row, int col){
		data.elementAt(row).insertElementAt(value, col);
	}

	

	
	

}
