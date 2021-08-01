package activities5;

public class Team {
	private String name;
	private long matches;
	
	
	
	public Team() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMatches() {
		return matches;
	}
	public void setMatches(long matches) {
		this.matches = matches;
	}
	public Team(String name, long matches) {
		super();
		this.name = name;
		this.matches = matches;
	}
	@Override
	public String toString() {
		return  name +"- "+ matches ;
	}
	

}
