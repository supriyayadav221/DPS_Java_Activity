package act1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class localdate {
	

	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter date in dd-MM-yyyy");
		String dob=sc.next();
		
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	 String validDob= LocalDate.parse(dob, formatter).format(formatter2);
	    
		  LocalDate l = LocalDate.parse(validDob);
		  //LocalDate l=LocalDate.of(1998, 04, 23); //specify year, month, date directly
		  LocalDate now = LocalDate.now(); //gets localDate
		  Period diff = Period.between(l, now); //difference between the dates is calculated
		  System.out.println(diff.getYears() + "years " + diff.getMonths() + "months " + diff.getDays() + "days ");

	}

}
