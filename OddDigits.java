import java.util.Scanner;

public class OddDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean hasOddDigit = false;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 != 0) {
                hasOddDigit = true;
                break;
            }
            n /= 10;
        }

        System.out.println(hasOddDigit ? "True" : "False");
        scanner.close();
    }
}
