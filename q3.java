import java.util.TreeMap;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> tm = new TreeMap<>();
		  tm.put(8,"p1");
		  tm.put(10,"p2");
		  tm.put(9,"p3");
		  tm.put(5,"p4");
		  tm.put(3,"p5");
		  System.out.println(tm);
		  System.out.println("scheduling sequence:");
		 
		for(int key: tm.keySet()) {
			  System.out.println(" "+tm.get(key));
		}
			  System.out.println("OS completion time:");
			  int ct=0;
			for(int key: tm.keySet()) {
				ct=ct+key;
			
			  System.out.println(tm.get(key)+" "+ct);

	}

	}
}
