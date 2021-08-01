package activities5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
	
		Scanner sc= new Scanner(System.in);
//		
//			System.out.println("Enter match: ");
//			String a =sc.next();
//			String bb=sc.next();
//			SortScore s1=new SortScore(a,bb);
//			Thread t1 =new Thread(s1);  
//			t1.start(); 
//			
//			System.out.println("Enter match: ");
//			String m =sc.next();
//			String n=sc.next();
//			SortScore s2=new SortScore(m,n);
//			Thread t2 =new Thread(s2);  
//			t2.start(); 
//			
//			System.out.println("Enter match: ");
//			String x =sc.next();
//			String y=sc.next();
//			SortScore s3=new SortScore(x,y);
//			Thread t3 =new Thread(s3);  
//			t3.start(); 
		
			System.out.println("Enter match: ");
			String a =sc.next();
			System.out.println("Enter scores: ");
			String b=sc.next();
			
			
			System.out.println("Enter match: ");
			String m =sc.next();
			System.out.println("Enter scores: ");
			String n=sc.next();
			
			
			System.out.println("Enter match: ");
			String x =sc.next();
			System.out.println("Enter scores: ");
			String y=sc.next();
			
			
			SortScore s1=new SortScore(a,b);
			SortScore s2=new SortScore(m,n);
			SortScore s3=new SortScore(x,y);
			
			 s1.start();
			  
		        // starts second thread after when
		        // first thread t1 has died.
		        try
		        {
		            
		            s1.join();
		        }
		  
		        catch(Exception ex)
		        {
		            System.out.println("Exception has " +
		                                "been caught" + ex);
		        }
		  
		        // t2 starts
		        s2.start();
		  
		        // starts t3 after when thread t2 has died.
		        try
		        {
		           
		            s2.join();
		        }
		  
		        catch(Exception ex)
		        {
		            System.out.println("Exception has been" +
		                                    " caught" + ex);
		        }
		  
		        s3.start();
		        try
		        {
		           
		            s3.join();
		        }
		  
		        catch(Exception ex)
		        {
		            System.out.println("Exception has been" +
		                                    " caught" + ex);
		        }
		       
		       
		        int a1[] =s1.getScores();
		        int a2[]=s2.getScores();
		        int a3[]=s3.getScores();
		        
		        System.out.println("Match: "+s1.getMatchType()); 
		        for(int d: a1)
		        {
		        	System.out.println(d);
		        }
		        System.out.println("Match: "+s2.getMatchType()); 
		        
		        for(int d: a2)
		        {
		        	System.out.println(d);
		        }
		        System.out.println("Match: "+s3.getMatchType()); 
		        for(int d: a3)
		        {
		        	System.out.println(d);
		        }
		        
		    }
			
			
		
	}


