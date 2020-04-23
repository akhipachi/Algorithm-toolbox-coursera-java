import java.util.*;
import java.io.*;

public class CarFueling {
    static int computeMinRefills(int dist, int tank, int[] stops) {
        
        Arrays.sort(stops);
        int[] a=new int[stops.length+2];
        a[0]=0;
        for(int j=0;j<stops.length;j++)
            a[j+1]=stops[j];
        a[a.length-1]=dist;
        int count=0,d=0,cap=tank;
        int i=0;
        while(d<dist&&i<a.length-1)
        {

            if(a[i+1]-a[i]<=cap)
            {
                d=a[i+1];
                cap-=a[i+1]-a[i];
                i++;
            }
            else
            {
                cap=tank;
                count++;
                if(a[i+1]-a[i]<=cap)
                {
                    d=a[i+1];
                    cap-=a[i+1]-a[i];
                    i++;
                }
                else
                    break;
            }
        }
        
        if(d>=dist)
            return count;
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n];
        for (int i = 0; i < n; i++) {
            stops[i] = scanner.nextInt();
        }

        System.out.println(computeMinRefills(dist, tank, stops));
    }
}
