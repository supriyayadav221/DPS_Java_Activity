package act2;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;


public class parkingManagementMain {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Vehicle no");
	String v=sc.nextLine();
	System.out.println("Enter check in date with time in \"yyyy-MM-dd HH:mm:ss \"");
	String checkIn=sc.nextLine();
	System.out.println("Enter check out date with time in \"yyyy-MM-dd HH:mm:ss \"");
	String checkOut=sc.nextLine();
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	LocalDateTime dateTime1= LocalDateTime.parse(checkIn, formatter);
	LocalDateTime dateTime2= LocalDateTime.parse(checkOut, formatter);
	
	long minutes = Duration.between(dateTime1, dateTime2).toMinutes();

//	long milli = java.time.Duration.between(dateTime1, dateTime2).toMillis();
//	long sec = java.time.Duration.between(dateTime1, dateTime2).getSeconds();

	
	double amount=minutes*1.0;
System.out.println("Total Amount for parking is: "+amount);
}
}
