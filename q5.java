import java.util.LinkedHashSet;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		hs.add("dipu");
		hs.add("prashant");
		hs.add("kamlesh");
		hs.add("rishav");
		System.out.println(hs);
		System.out.println("Hash Table contains rishav : " + hs.contains("rishav"));
		hs.remove("rishav");
		System.out.println(hs);

	}

} 
