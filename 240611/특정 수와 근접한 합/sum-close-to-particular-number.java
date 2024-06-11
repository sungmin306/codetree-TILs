import java.util.*;
import java.io.*;

public class Main {

    public static int N, S;
    public static int result = 100;
    public static int[] arr;

    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        arr = new int[N];
        int totalSum = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            totalSum += arr[i];
        }
        
        for(int i = 0; i < N - 1; i++) {
            for(int j = i + 1; j < N; j++) {
                int num = arr[i] + arr[j];
                int temp = totalSum - num;
                result = Math.min(result, Math.abs(S - temp));
            }
        }

        System.out.println(result);
    }
}