package activities;
import java.util.*;
public class first {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String firstName=sc.next();
		String lastName=sc.next();
		
		//System.out.println(StringUtils.capitalize(firstName)+" "+lastName.toUpperCase());
		System.out.println(firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase()+" "+lastName.toUpperCase());
		
		
	}

}
