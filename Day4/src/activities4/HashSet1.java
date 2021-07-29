package activities4;
import java.util.*;
public class HashSet1 {
	 public static void main(String[] args)
	 {
		 try {
			 Scanner sc = new Scanner(System.in);
			 int n=sc.nextInt();
			 ArrayList<String> list = new ArrayList<String>();
			 for(int i=0;i<n;i++)
			 {
				 list.add(sc.next());
			 }
			 HashSet<String> hash = new HashSet(list);
			 int count=0;
			 for(String s:hash)
			 {
				 count++;
			 }
			 System.out.print(count);
			 
		 }
		 catch(Exception e)
		 {
			 System.out.print(e);
		 }
	 }

}
