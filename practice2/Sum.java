import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double y = 0;
        for (int i = 1; i <= n; i++) {
            y += 1.0 / Math.sqrt(i);
        }

        System.out.println(y);
        scanner.close();
    }
}
