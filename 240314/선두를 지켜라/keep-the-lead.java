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
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            for(int j = 0; j < t; j++) {
                distanceA = distanceA + v; 
                arrayListA.add(distanceA);
            }
        }
        int distanceB = 0;
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            for(int j = 0; j < t; j++) {
                distanceB = distanceB + v; 
                arrayListB.add(distanceB);
            }
        }

        int result = 0;
        for(int i = 0; i < arrayListA.size(); i++) {
            if(arrayListA.get(i) == arrayListB.get(i)) result++;
        }

        System.out.println(result-1);

    }


}