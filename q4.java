import java.util.HashSet;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>hs = new HashSet<>();
		hs.add("rama");
		//hs.add("prashant");
		hs.add("rafi");
		hs.add("aman");
		hs.add("raman");
		System.out.println(hs);
		System.out.println("Hash Table contains aman : " + hs.contains("aman"));
		hs.remove("rafi");
		System.out.println(hs);

	}

}
