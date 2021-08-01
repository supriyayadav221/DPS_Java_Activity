package activities5;

import java.util.Arrays;

public class SortScore extends Thread {
	private String matchType;
	private String scoreString;
	int scores[]=new int[5];
	
	public SortScore(String matchType, String scoreString) {
		super();
		this.matchType = matchType;
		this.scoreString = scoreString;
	}
	

	public String getMatchType() {
		return matchType;
	}


	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}


	public int[] getScores() {
		String arr[]=scoreString.split(",");
		int newArr[]=new int[5];
		for(int i=0; i<5; i++) {
	         newArr[i] = Integer.parseInt(arr[i]);
	      }
		Arrays.sort(newArr);
		
		
		return newArr;
	}

	
	public void run(){  
		
		
		
		 for (int i = 0; i < 3; i++)
	        {
	            try
	            {
	                Thread.sleep(500);
//	                System.out.println("Current Thread: "
//	                        + Thread.currentThread().getName());
	            }
	  
	            catch(Exception ex)
	            {
	                System.out.println("Exception has" +
	                                " been caught" + ex);
	            }
//	            System.out.println(i);
	        }

	
	

}}
