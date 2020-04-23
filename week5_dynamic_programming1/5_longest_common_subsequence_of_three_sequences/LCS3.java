import java.util.*;

public class LCS3 {

    private static int lcs3(int[] a, int[] b, int[] c) {
        //Write your code here
        int[][][] mem=new int[a.length][b.length][c.length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            Arrays.fill(mem[i][j],-1);
        }
        return helper(a,b,c,0,0,0,mem);
    }
    static int helper(int[] a,int[] b,int[] c,int i,int j,int k,int[][][] mem)
    {
        if(i==a.length||j==b.length||k==c.length)
        return 0;
        if(a[i]==b[j]&&b[j]==c[k])
        {
            return helper(a,b,c,i+1,j+1,k+1,mem)+1;
        }
        if(mem[i][j][k]!=-1)
        return mem[i][j][k];
            int n1=helper(a,b,c,i+1,j+1,k,mem);
            int n2=helper(a,b,c,i,j,k+1,mem);
            int n3=helper(a,b,c,i,j+1,k+1,mem);
            int n4=helper(a,b,c,i+1,j,k,mem);
            int n5=helper(a,b,c,i+1,j,k+1,mem);
            int n6=helper(a,b,c,i,j+1,k,mem);
            int ans=Math.max(n1,Math.max(n2,Math.max(n3,Math.max(n4,Math.max(n5,n6)))));
            mem[i][j][k]=ans;
            return ans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int an = scanner.nextInt();
        int[] a = new int[an];
        for (int i = 0; i < an; i++) {
            a[i] = scanner.nextInt();
        }
        int bn = scanner.nextInt();
        int[] b = new int[bn];
        for (int i = 0; i < bn; i++) {
            b[i] = scanner.nextInt();
        }
        int cn = scanner.nextInt();
        int[] c = new int[cn];
        for (int i = 0; i < cn; i++) {
            c[i] = scanner.nextInt();
        }
        System.out.println(lcs3(a, b, c));
    }
}

