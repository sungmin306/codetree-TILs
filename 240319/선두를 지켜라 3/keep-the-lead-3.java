import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arrayListA = new ArrayList<>();
        ArrayList<Integer> arrayListB = new ArrayList<>();
        int distanceA = 0;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            while(t --> 0) {
                distanceA = distanceA + v;
                arrayListA.add(distanceA);
            }
        }
        int distanceB = 0;
        for(int j = 0; j < m; j++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            while(t --> 0) {
                distanceB = distanceB + v;
                arrayListB.add(distanceB);
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        for(int i = 0; i < arrayListA.size(); i++) {
            if(arrayListA.get(i) < arrayListB.get(i)) arr.add(-1);
            else if(arrayListA.get(i) > arrayListB.get(i)) arr.add(1);
            else arr.add(0);
        }
        int result = 0;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i-1) != arr.get(i)) result++;
        }
        
        System.out.println(result);
    }
}