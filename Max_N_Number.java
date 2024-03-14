import java.util.Scanner;

public class Max_N_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter of N:");
        int n = scanner.nextInt();
        System.out.println("Enter of x:");
        int x = scanner.nextInt();
        int max = x;
        for (int i = 2; i <= n; i++) {
            System.out.println("Enter of x:");
            x = scanner.nextInt();
            if (x > max) {
                max = x;
            }
        }
        System.out.println("Max is:" + max);
    }
}
