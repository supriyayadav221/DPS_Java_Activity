package activities5;

import java.util.Comparator;

public class TeamComparator implements Comparator<Team>{

	@Override
	public int compare(Team o1, Team o2) {
		if(o1.getMatches()>o2.getMatches())
		{
			return 1;
		}
		if(o1.getMatches()<o2.getMatches())
		{
			return -1;
		}
		else {
			return 0;
		}
	}



}
