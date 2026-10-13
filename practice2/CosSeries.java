import java.util.Locale;
import java.util.Scanner;

public class CosSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double x = scanner.nextDouble();
        int n = scanner.nextInt();

        double sum = 1.0;
        double term = 1.0;
        for (int i = 1; i <= n; i++) {
            term *= -x * x / ((2.0 * i - 1) * (2.0 * i));
            sum += term;
        }

        System.out.println(sum);
        scanner.close();
    }
}
