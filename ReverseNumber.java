import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        long n=(new Scanner(System.in).nextLong());
        long reverse =0;
        while (n!=0) {
            reverse=reverse*10;
            reverse=reverse+n%10;
            n=n/10;
        }
        System.out.println(reverse);
    }
}
