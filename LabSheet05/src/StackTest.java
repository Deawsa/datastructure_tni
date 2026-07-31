import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<Integer> stacks = new Stack<Integer>();
		int number =1;
		
		while (number<=5) {
			stacks.push(number++);
			System.out.println("Push in track : " +stacks.peek());
			
		}
		System.out.println("Train car after into dead-end track : "+stacks+"\n"); 
		
		while (!stacks.empty()) {
			System.out.println("Pop from track : " +stacks.pop());
			 }
		System.out.println("Train car after into dead-end track : "+stacks+"\n"); 


	}

}

