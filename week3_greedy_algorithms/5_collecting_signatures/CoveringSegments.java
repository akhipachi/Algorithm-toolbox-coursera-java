import java.util.*;

public class CoveringSegments {

    private static int[] optimalPoints(Segment[] segments) {
        //write your code here
        int n=segments.length;
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j>n-i;j++)
        	{
        		if(segments[j].start>segments[j+1].start)
        		{
        			int t1=segments[i].start,t2=segments[i].end;
        			segments[i].start=segments[i+1].start;
        			segments[i].end=segments[i+1].end;
        			segments[i+1].start=t1;
        			segments[i+1].end=t2;
        		}
        	}
        }
            ArrayList<Integer> a=new ArrayList<Integer>();
            int point=segments[0].end;
            a.add(point);
            for(int i=0;i<n;i++)
            {
            	if (point < segments[i].start || point > segments[i].end) { // if the point is not in the segment
            point = segments[i].end; // update the point to the end point of the current segment
            a.add(point); // store it in the vector
        }
            	/*int match=1;
            	for(int j=0;j<segments.length;j++)
            	{
            		if(i>=segments[i].end&&i<=segments[j].end&&b[i]==0){
            			continue;
            			b[i]++;
            		}
            		else
            		{
            			match=0;
            			
            		}
            	}
            	if(match==1){
            		a.add(i);
            		break;
            	}
            	else
            	{

            	}*/
            }
        int[] b=new int[a.size()];
        for(int i=0;i<a.size();i++)
        	b[i]=a.get(i);
        return b;
    }

    private static class Segment {
        int start, end;

        Segment(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Segment[] segments = new Segment[n];
        for (int i = 0; i < n; i++) {
            int start, end;
            start = scanner.nextInt();
            end = scanner.nextInt();
            segments[i] = new Segment(start, end);
        }
        int[] points = optimalPoints(segments);
        System.out.println(points.length);
        for (int point : points) {
            System.out.print(point + " ");
        }
    }
}
 
