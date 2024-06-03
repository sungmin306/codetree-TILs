import java.util.*;
import java.io.*;


public class Main {

    public static int N;

    
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int result = Integer.MAX_VALUE;

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int s = 0; s < N; s++) {
            int sum = 0;
            for(int i = 0; i < N; i++) {
                int start = (s + i) % N;
                sum += arr[start] * i;
            }
            result = Math.min(result, sum);
        }
        System.out.println(result);

    }
}