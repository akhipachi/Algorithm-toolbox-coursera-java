import java.util.*;

public class FractionalKnapsack {
    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0,w=0;
        double[] a=new double[values.length];
        for(int i=0;i<values.length;i++)
            a[i]=(double) values[i]/weights[i];
        /*for(int i=1;i<values.length;i++)
        {
            for(int j=0;j<values.length-i;j++)
            {
                if(a[j]<a[j+1])
                {
                    double temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    int temp1=weights[j];
                    weights[j]=weights[j+1];
                    weights[j+1]=temp1;
                }
            }
        }*/
        int i=max(a,weights),item=0;
        //a[i]=-1;
        //i=max(a,weights);
        while(w<capacity&&item<values.length)
        {
            if(weights[i]<=capacity-w)
            {
                w+=weights[i];
                value+=(a[i]*weights[i]);
                a[i]=-1;
                item++;
                i=max(a,weights);               
            }
            else
            {
                weights[i]--;
            }
        }
        return value;
    }
    static int max(double[] a, int w[])
    {
        double max=-1;
        int loc=0;
        for(int i=0;i<a.length;i++)
        {
            
            if(a[i]>max)
            {
                max=a[i];
                loc=i;
            }
        }
        //System.out.println(max);
        return loc;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }
} 
