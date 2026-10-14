//Sum of Even Positions
/*You are given an array A of length N. Your task is to find the sum of the elements that are present at even positions after reversing the array.
The position is considered even using 0-based indexing, meaning the positions are 0, 2, 4, etc.
Return the sum of the elements at these positions in the reversed array.
Input Format
- The first line contains an integer N, representing the number of elements in the array.
- The second line contains N integers separated by spaces, representing the elements of the array.
Output Format
Return an integer representing the sum of the array elements present at the even positions of the reversed array.

Sample Input:
5
1 2 3 4 5

Sample Output:
9

The original array is:
[1, 2, 3, 4, 5]
After reversing the array:
[5, 4, 3, 2, 1]
The elements at even indices 0, 2, 4 are 5, 3, 1.
Their sum is:
5 + 3 + 1 = 9

Program :*/

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