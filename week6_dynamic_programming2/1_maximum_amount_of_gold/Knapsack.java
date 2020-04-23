import java.util.*;

public class Knapsack {
    static int optimalWeight(int W, int[] w) {
        //write you code here
        int[][] mem=new int[w.length][W+1];
        for(int i=0;i<w.length;i++)
        {
          Arrays.fill(mem[i], -1);
        }
        return helper(W, w, 0, 0,mem);
    }
    static int helper(int n,int[] w,int i,int x,int[][] mem)
    {
      if(i>=w.length)
      {
        return x;
      }
      if(x==n)
      return x;
      if(mem[i][x]!=-1)
      return mem[i][x];
      int a=0;
      if(x+w[i]<=n)
      a=helper(n,w,i+1,x+w[i],mem);
      int b=helper(n,w,i+1,x,mem);
      mem[i][x]=Math.max(a,b);
      return mem[i][x];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W, n;
        W = scanner.nextInt();
        n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        System.out.println(optimalWeight(W, w));
    }
}

