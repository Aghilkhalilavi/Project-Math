import java.util.Scanner;

public class PythagoreanTheorem2 {
    public static void main(String[] args) {
    int n=(new Scanner(System.in).nextInt());
       for(int a=1;a<=n;a++)
        for(int b=a;b<=n;b++)
         for(int c=b;c<=n;c++)
    if (a*a+b*b==c*c) {
        System.out.println("("+a+","+b+","+c+")");
    }
       
    }
}
