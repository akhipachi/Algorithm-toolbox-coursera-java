import java.util.Scanner;

public class Fibonacci {
   public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    long a=0,b=1,c;
    for(int i=1;i<n;i++)
    {
    	c=a+b;
    	a=b;
    	b=c;
    }
    if(n==0)
    	System.out.println(0);
    else
    System.out.println(b);
  }
}
