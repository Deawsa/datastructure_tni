import java.util.ArrayList;
import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        for (int i = 1; i < initial_numbers.length; i++){
            numbers.add(initial_numbers[i]);
        }
        Scanner scanner = new Scanner(System.in);
        numbers.addLast(scanner.nextInt());
        numbers.add(7,scanner.nextInt());
        numbers.remove(3);
        numbers.add(3,10);

        System.out.println(numbers);

    }
}
