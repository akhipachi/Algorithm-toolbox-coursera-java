import java.util.*;

public class FibonacciPartialSum {
    private static long getFibonacciPartialSumNaive(long from, long to) {
        long sum = 0;

        long current = 0;
        long next  = 1;

        for (long i = 0; i <= to; ++i) {
            if (i >= from) {
                sum += current;
            }

            long new_current = next;
            next = next + current%10;
            current = new_current%10;
        }

        return sum % 10;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long from = scanner.nextLong();
        long to = scanner.nextLong();
        if(from%60>to%60)
        {
        System.out.println(getFibonacciPartialSumNaive(from%60, 60)+getFibonacciPartialSumNaive(0,to%60));  
        }
        else
        System.out.println(getFibonacciPartialSumNaive(from%60, to%60));
    }
}

