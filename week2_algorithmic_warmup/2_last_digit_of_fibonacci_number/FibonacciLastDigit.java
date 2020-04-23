import java.util.*;
import java.math.*;
public class FibonacciLastDigit {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger a=new BigInteger("0");
        BigInteger b=new BigInteger("1");
        BigInteger c=new BigInteger("0");
    for(int i=1;i<n;i++)
    {
        c=(a.add(b)).mod(BigInteger.valueOf(10));
        a=b.mod(BigInteger.valueOf(10));
        b=c;
    }
    if(n==0)
        System.out.println(0);
    else
    System.out.println(b);
    }
}

