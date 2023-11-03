import java.util.HashMap;

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<String,Integer> hm=new HashMap<>();
	        hm.put("dipu",78);
	        hm.put("aman",56);
	        hm.put("raman",67);
	        hm.put("rishab",98);
	       // hm.put("kamlesh",34);
	      
	        System.out.println("total student : " + hm.size());
	        for(String key : hm.keySet()){
	        	System.out.println(key + " score marks :" + hm.get(key));
	        }
	        System.out.println("search :" + hm.containsKey("dipu"));
	        hm.remove("aman");
	        System.out.println("search: " + hm.containsKey("Prashant"));
	        System.out.println(hm);

	}

}
