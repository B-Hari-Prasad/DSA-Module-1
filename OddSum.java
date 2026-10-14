import static java.lang.System.out;
import java.util.Scanner;

class OddSum {

    static int sumOfOddDigits(int n) {
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;

            if (digit % 2 != 0) {
                sum += digit;
            }

            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		out.print("Enter an Integer value to find the odd numbers sum: ");
        int n = scanner.nextInt();

        out.println(sumOfOddDigits(n));

        scanner.close();
    }
}