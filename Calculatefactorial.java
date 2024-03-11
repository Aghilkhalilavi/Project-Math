import java.util.Scanner;

public class Calculatefactorial {

  public static void main(String[] args) {
    long n=(new Scanner(System.in).nextLong());
    long fact=1;
    for(int i=1;i<=n;i++){
    fact=fact*i;
    }
    System.out.println(n+"!="+fact);
  }
}
