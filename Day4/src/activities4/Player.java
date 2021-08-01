package activities4;

import java.io.*;
import java.lang.String;

public class Player implements Comparable<Player>{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Player() {
		super();
	}

	public Player(String name){
		this.name = name;
	}

	@Override
	public int compareTo(Player o) {
		if(name.equals(o.getName()))  
			return 0;  
			else if(name.compareTo(o.getName())>0)  
			return 1;  
			else  
			return -1;
	}
	
	@Override
    public String toString() {
        return name;
    }
}