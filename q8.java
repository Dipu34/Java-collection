import java.util.ArrayList;
import java.util.List;
 
public class q8 {
	 List<Integer> stackList;
	 q8() {
	        stackList = new ArrayList<>();
		
	 }
	 void push(int value) {
	        stackList.add(value);
	    }
	 int pop() {
		 if(!isempty()) {
			
	int popvalue=stackList.get(stackList.size()-1);
	stackList.remove(stackList.size()-1);
	return popvalue;
	
		 }else {
			 System.out.println("stack is already empty");
			 return -1;
			 
		 }
	 }
	 boolean isempty() {
		if(stackList.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	 }
	 int peek() {
		 return stackList.get(stackList.size()-1);
	 }

	public static void main(String[] args) {
		 q8 mystack=new q8();
	
		 mystack.push(5);
         mystack.push(8);
         mystack.push(2);
         mystack.push(9);

         System.out.println("**dgyegdg");
         System.out.println(mystack.isempty()); 
         System.out.println(mystack.peek()); 
         System.out.println(mystack.pop()); 
         System.out.println(mystack.peek()); 
         System.out.println(mystack.pop()); 
    }
	}


