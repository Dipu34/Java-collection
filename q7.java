import java.util.*;

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<Integer>();
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
		int num = sc.nextInt();
		set.add(num);
		}
		System.out.println("Elements with no duplicates: ");

	}

}
