
public class binarySearch01 {

	public static void main(String[] args) {
		int[] nums = sorting(new int[ ]{96, 87, 18, 6, 31, 11, 56, 36, 76}) ;
		
		for(int num : nums) {
			System.out.print(num + " ");
		}

	}
	public static int[] sorting(int[] nums) {
		Sorting sort = new Sorting(nums);
		sort.bubbleSort();
		return sort.getArray();
	}

}
