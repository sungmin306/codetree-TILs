import java.io.*;
import java.util.*;

public class Main {

    public static int n;
    public static int[]counts;
 
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        int result = 0;
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x1[i] = Integer.parseInt(st.nextToken());
            x2[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < n; i++) {
            counts = new int[1001];
            for(int j = 0; j < n; j++) {
                if(i==j) continue;
                for(int k = x1[j]; k < x2[j]; k++) {
                    counts[k]++;
                }
            }
            int time = 0;
            for(int j = 0; j < 1001; j++) {
                if(counts[j] > 0) time++;
            }
            result = Math.max(result,time);
        }
        System.out.println(result);
    }
}

// for문 돌려허 하나 고르기
// 고르고 났을때 배열 값 넣기(겹치는 길이)
// 가장 큰 값 비교해서 넣기
