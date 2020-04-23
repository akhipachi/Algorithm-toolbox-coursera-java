import java.util.*;
import java.io.*;

public class MajorityElement {
    private static int getMajorityElement(int[] a) {
        Map<Integer,Integer> m=new HashMap<Integer,Integer>();
        for(int i=0;i<a.length;i++)
        {
            int prev=0;
            if(m.get(a[i])!=null)
            prev=m.get(a[i]);
            m.put(a[i],prev+1);
            if(prev+1>a.length/2)
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        FastScanner scanner=new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(getMajorityElement(a));
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}

