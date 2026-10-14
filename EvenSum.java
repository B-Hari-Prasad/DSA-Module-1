import static java.lang.System.out;
import java.util.Scanner;

class EvenSum {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		out.print("Enter How many numbers : ");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		
		for(int i =0;i<n;i++) {
			out.print("enter the number : ");
			arr[i] = scanner.nextInt();
		}
		
		int sum = 0;
		
		//Traverse the array in reverse order.
		for(int i = n-1; i >= 0; i = i-2) {
			sum += arr[i];
		}
		out.println("Total sum of Even Index numbers after reverse order is : "+sum);
		
		scanner.close();
	}
}