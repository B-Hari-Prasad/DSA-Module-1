import static java.lang.System.out;
import java.util.Scanner;

class ArraySum {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		out.print("Enter how many numbers you need to add : ");
		int n = scanner.nextInt();
		
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			out.print("Enter the number : ");
			int number = scanner.nextInt();
			
			sum = sum + number;
		}
		
		out.println("Total sum is : " +sum);
		
		scanner.close();
	}
}