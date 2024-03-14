import java.util.Scanner;

public class Multiple_N_Number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter of N:");
        int n = scanner.nextInt();
        int mult = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter of x");
            int x = scanner.nextInt();
            mult = mult * x;
        }
        System.out.println(mult);
    }
}
