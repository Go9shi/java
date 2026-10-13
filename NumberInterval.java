import java.util.Locale;
import java.util.Scanner;

public class NumberInterval {
    public static void printInterval(double a, double b) {
        double min = Math.min(a, b);
        double max = Math.max(a, b);
        long c = (long) Math.ceil(max);
        long d = (long) Math.floor(min);

        System.out.println(min + " < " + max);
        System.out.println("c = " + c + ", d = " + d);
        System.out.println(c + " >= " + max + " > " + min + " >= " + d);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        printInterval(a, b);
        scanner.close();
    }
}
