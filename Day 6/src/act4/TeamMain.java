package act4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TeamMain {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of teams");
		ArrayList<Team> al=new ArrayList<>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			
			 al.add(new Team(sc.next(),sc.nextInt()));
		}
	//	Collections.sort(al, new TeamComparator());
		
		al.sort((Team o1, Team o2) -> (int)o1.getMatches() -(int)o2.getMatches());
		
		System.out.println("Team list after sort by number of matches");
		for(Team t:al)
		{
			System.out.println(t);
		}
	}

}
