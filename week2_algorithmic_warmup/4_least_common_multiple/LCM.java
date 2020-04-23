import java.util.*;
import java.math.*;
public class LCM {
  private static int gcd_naive(int a, int b) {
    if(b==0)
    {
      return a;
    }
    else
    {
      return gcd_naive(b,a%b);
    }
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    System.out.println(BigInteger.valueOf(a).multiply(BigInteger.valueOf(b)).divide(BigInteger.valueOf(gcd_naive(a, b))));
  }
}
