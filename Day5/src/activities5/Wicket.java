package activities5;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Wicket {
	 String playerName;
	 List<Bowler> bowler=new ArrayList<>();

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public List<Bowler> getBowler() {
		return bowler;
	}

	public void setBowler(List<Bowler> bowler) {
		
		this.bowler = bowler;
	}

	public Wicket(String playerName) {
		
		this.playerName = playerName;
	}

	 void addWicket(String playerName)
	 {
		 
	 }
	

}
