package activities5;

import java.util.Arrays;

public class SortScore extends Thread {
	
	public void run(){  
		
		String arr[]=scoreString.split(",");
		int newArr[]=new int[arr.length];
		for(int i=0; i<newArr.length; i++) {
	         newArr[i] = Integer.parseInt(arr[i]);
	      }
		Arrays.sort(newArr);
		
		
		scores=newArr;
		
//		
//		 for (int i = 0; i < 3; i++)
//	        {
//	            try
//	            {
//	                Thread.sleep(500);
////	                System.out.println("Current Thread: "
////	                        + Thread.currentThread().getName());
//	            }
//	  
//	            catch(Exception ex)
//	            {
//	                System.out.println("Exception has" +
//	                                " been caught" + ex);
//	            }
////	            System.out.println(i);
//	        }

	
	

}
	private String matchType;
	private String scoreString;
	private int scores[];
	
	public SortScore(String matchType, String scoreString) {
		super();
		this.matchType = matchType;
		this.scoreString = scoreString;
	}
	

	public String getMatchType() {
		return matchType;
	}



	public int[] getScores() {
		return scores;
	}

	
}
