package activities5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TeamMain {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Team> al=new ArrayList<>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			
			 al.add(new Team(sc.next(),sc.nextLong()));
		}
		Collections.sort(al, new TeamComparator());
		System.out.println("Team list after sort by number of matches");
		for(Team t:al)
		{
			System.out.println(t);
		}
	}

}
