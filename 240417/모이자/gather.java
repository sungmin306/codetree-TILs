import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static int[] arr;

    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int distance = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = 0;  j < n; j++) {
                sum += arr[j] * Math.abs(j - i);
            }
            distance = Math.min(distance, sum);
        }
        System.out.println(distance);


    }
}