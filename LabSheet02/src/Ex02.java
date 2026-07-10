import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] nums = new int[5];
		
		for (int i=0; i<nums.length;i++) {
			System.out.print("Enter number index " + i + ": ");
			nums[i] = scan.nextInt();
			
		}
		Arraycontroller numbers = new Arraycontroller();
		numbers.setNums(nums);
		numbers.display("\nDisplay all element");

	}

}
