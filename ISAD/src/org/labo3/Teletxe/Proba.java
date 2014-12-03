package org.labo3.Teletxe;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Proba {

	public static void main(String[] args) {

		DBKudeatzailea dbk = DBKudeatzailea.getInstantzia();

	    
		
		dbk.execSQL("CREATE TABLE `bezeroa` (`Nan` varchar(9) NOT NULL,`izena` varchar(20) DEFAULT NULL,`HarremanTlf` varchar(20) DEFAULT NULL,PRIMARY KEY (`Nan`))");
		
		
		
		
		
		
		/*try{
	    	
	  Update Ordainagiria set ordaindua?="false" where ordainzenb=%ordainzbk
	  select bezerokod from ordainagiria where ordainzenb=%ordainzbk
	  select count (*) as kopuru from ordainagiria where bezeroKod=%beznan ordaindua?="false
	  update eraikina set arazoak?="true" where bezeroKod=%beznan
	  delete from eraikina where bezerokod?%beznan and egoera?="eskaintza"
	  delete from bisita where eraikZenb from eraiina bezerokod=%beznan and egoera?="bisita and data /= %DataGaur
	  select * From Bisita where Eraikzenb in (Select eraikzenb from eraikina bezeroKod=%beznan and egoera?="bisita" and data=%datagaur
	  
	  
	    	
	    	
	    	
	    	
	    }
	    catch(SQLException e){
	    	System.out.println(e);
	    }*/
	
	   
	}

}