import java.util.*;
import java.io.*;

public class Main {
    public static ArrayList<Integer> arrayListA = new ArrayList<>();
    public static ArrayList<Integer> arrayListB = new ArrayList<>();
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int distanceA = 0;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);
            if(c == 'L') {
                 while(d --> 0) {
                    distanceA--;
                    arrayListA.add(distanceA);
                }
            }
            if(c == 'R') {
                 while(d --> 0) {
                    distanceA++;
                    arrayListA.add(distanceA);
                }
                    
            }
        }
        
        int distanceB = 0;
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);
            if(c == 'L') {
                 while(d --> 0) {
                    distanceB--;
                    arrayListB.add(distanceB);
                }
            }
            if(c == 'R') {
                 while(d --> 0) {
                    distanceB++;
                    arrayListB.add(distanceB);
                }
            }
        }
        int aSize = arrayListA.size();
        int bSize = arrayListB.size();
        if(aSize > bSize) {
            int l = aSize - bSize;
            for(int i = 0; i < l; i++) {
                arrayListB.add(arrayListB.get(bSize-1));
            }
        }
        if(aSize < bSize) {
            int l = bSize - aSize;
            for(int i = 0; i < l; i++) {
                arrayListA.add(arrayListA.get(aSize-1));
            }
        }
        int result = 0;
        for(int i = 1; i < arrayListA.size(); i++) {
            if(arrayListA.get(i) == arrayListB.get(i)) {
                if(arrayListA.get(i-1) != arrayListB.get(i-1)) result++;
            }
        }
        System.out.println(result);
        // System.out.println(arrayListA.toString());
        // System.out.println(arrayListB.toString());
    }
}