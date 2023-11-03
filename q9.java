import java.util.Stack;

public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int decimal = 29;
		Stack<Integer> stack = new Stack<Integer>();
		while (decimal > 0) {
		int remainder = decimal % 2;
		stack.push(remainder);
		decimal /= 2;
		}
		System.out.print("The binary equivalent of 29 is: ");
		while (!stack.isEmpty()) {
		System.out.print(stack.pop());
		}
		}
		

	}


