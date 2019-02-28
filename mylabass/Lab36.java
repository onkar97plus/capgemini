package com.cg.mylabass;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

public class Lab36 {

	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   ZoneId in=ZoneId.of("Asia/Kolkata");
		   ZonedDateTime zone1=ZonedDateTime.of(LocalDateTime.of(2019, Month.JANUARY,13,17,48),in);
	       System.out.println("In india central time zone: "+zone1);;
	       ZoneId timenow=ZoneId.of(sc.nextLine());
	       ZonedDateTime zone2=zone1.withZoneSameInstant(timenow);
	       System.out.println("In Tokyo central time zone: "+zone2);
	       sc.close();
	}

}
