import java.util.*;

public class FibonacciHuge {
    private static long getFibonacciHugeNaive(long n, long m) {
        if (n <= 1)
            return n;

        long previous = 0;
        long current  = 1;

        for (long i = 1; i < n; ++i) {
            long tmp_previous = previous;
            previous = current%m;
            current = tmp_previous + current%m;
        }

        return current % m;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long a=-1,b=-1,count=1;
        long previous = 0;
        long current  = 1;

        while(true) {
            long tmp_previous = previous;
            previous = current%m;
            current = tmp_previous + current%m;
            if(previous==0&&current==1){
                
                break;
            }
            count++;
            }
            System.out.println(getFibonacciHugeNaive(n%count, m));
    }
}

