import java.util.Scanner;

public class Sum_N_Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter of N:");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter of x");
            int x = scanner.nextInt();
            sum = sum + x;
        }
        System.out.println(sum);
    }
}
