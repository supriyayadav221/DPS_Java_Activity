package activities4;

import java.util.*;

public class team {
	private String name;
	private List<Player> playerList = new ArrayList<Player>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Player> getPlayerList() {
		Collections.sort(playerList);
		return playerList;
	}
	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}
	
	public team(String name){
		this.name = name;
	}
	
	public void addPlayer(String playername) {
		Player p = new Player(playername);
		playerList.add(p);
	}
	
	public int compareTo(team o) {
		if(name.equals(o.getName()))  
			return 0;  
			else if(name.compareTo(o.getName())>0)  
			return 1;  
			else  
			return -1;
	}
}