import java.util.*;
import java.io.*;

public class Partition3 {
    private static int partition3(int[] a) {
        //write your code here
        if(a.length<3)
        return 0;
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        // System.out.println(sum);
        if(sum%3!=0)
        return 0;
        return helper(a,0,0,0,0);
        
    }
    static int helper(int[] a, int i,int n1,int n2,int n3)
    {
        if(i>=a.length)
        {
            if(n1==n2&&n2==n3)
            return 1;
            else
            return 0;
        }
        int a1=helper(a,i+1,n1+a[i],n2,n3);
        int a2=helper(a,i+1,n1,n2+a[i],n3);
        int a3=helper(a,i+1,n1,n2,n3+a[i]);
        // System.out.println(a1|a2|a3);
        return a1|a2|a3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println(partition3(A));
    }
}

