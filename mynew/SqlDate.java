package com.cg.mynew;

import java.time.LocalDate;

import java.util.Date;

public class SqlDate {

	public static void main(String[] args) {
		java.sql.Date sqlDate = new java.sql.Date(new Date().getTime());
        
        //Get LocalDate from SQL date
        LocalDate localDate = sqlDate.toLocalDate();
         
        System.out.println( localDate );  
	}

}
