import java.util.*;

public class DotProduct {
    private static long maxDotProduct(int[] a, int[] b) {
        //write your code here
        long result = 0;
        int ai=0,bi=0;

        for(int i=a.length-1;i>=0;i--){
            ai=max(a);
            bi=max(b);
            if(a[ai]<0||b[bi]<0){
                ai=min(a);
                bi=min(b);
            }
            
                result+=a[ai]*b[bi];
            
            a[ai]=-999999;
            b[bi]=-999999;
        }
        
        return result;
    }
    static int max(int [] a)
    {
        int max=a[0],loc=0;
        for(int i=0;i<a.length;i++)
            if(a[i]>max)
            {
                max=a[i];
                loc=i;
            }
            return loc;
    }
    static int min(int [] a)
    {
        int max=999999,loc=0;
        for(int i=0;i<a.length;i++)
            if(a[i]<max&&a[i]!=-999999)
            {
                max=a[i];
                loc=i;
            }
            return loc;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        System.out.println(maxDotProduct(a, b));
    }
}


