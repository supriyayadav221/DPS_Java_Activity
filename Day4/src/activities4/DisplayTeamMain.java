package activities4;

import java.io.*;
import java.util.*;
public class DisplayTeamMain {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter total number of elements:");
		int numbers = Integer.parseInt(br.readLine());
		Map<String, team> m = new HashMap<>();
		
		ArrayList <String> s = new ArrayList<String>();
		for(int i=0;i<numbers;i++) {
			s.add(br.readLine());
		}
		
		for(int i=0;i<numbers;i++) {
			String arr[] = s.get(i).split("\\|");
			if(m.containsKey(arr[0])) {
				team t1 = m.get(arr[0]);
				t1.addPlayer(arr[1]);
			}
			else {
				team t2 = new team(arr[0]);
				t2.addPlayer(arr[1]);
				m.put(arr[0], t2);
			}
		}
		Map<String, team> result2 = new LinkedHashMap<>();
        m.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEachOrdered(x -> result2.put(x.getKey(), x.getValue()));
		
        result2.forEach((k,v) -> {
        	System.out.println(k);
            for (int i = 0; i < v.getPlayerList().size(); i++) {
                System.out.println("--" + v.getPlayerList().get(i));
            }
        });
        

	}
}