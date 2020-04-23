import java.util.Arrays;
import java.util.Scanner;

public class ChangeDP {
    private static int getChange(int m,int[] mem) {
        //write your code here
        if(m==0)
        return 0;
        if(mem[m]!=-1)
        return mem[m];
        int n1=0,n2=0,n3=0;
        if(m-1>=0)
        n1=getChange(m-1,mem);
        if(m-3>=0)
        n2=getChange(m-3,mem);
        if(m-4>=0)
        n3=getChange(m-4,mem);
        int ans=Math.min(Math.min(n1,n2),n3)+1;
        mem[m]=ans;
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int[] mem=new int[m+1];
        Arrays.fill(mem,-1);
        System.out.println(getChange(m,mem));

    }
}

