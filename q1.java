import java.util.TreeSet;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>();
		// Add elements to the tree set.
		ts.add("B");
		ts.add("A");
		ts.add("C");
		ts.add("C");
		ts.add("D");
		System.out.println(ts); 
	
		
		System.out.println("containsA:"+ts.contains("A"));
		System.out.println("containsE:"+ts.contains("E"));
	System.out.println("removeC:"+ts.remove("C"));
	System.out.println("removeF:"+ts.remove("F"));
	ts.add("N");
	ts.add("J");
	System.out.println(ts);
}
	}


