import java.util.*;
import java.io.*;


public class Main {
    public static int N, K;
    public static int[]map = new int[101];
    public static int result = 0;

    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[b] += a;

        }

        for(int c = 0; c < 101; c++) {
            int cnt = 0;
            for(int i = c - K; i <= c + K; i++) {
                if(i >= 0 && i < 101) {
                    cnt+=map[i];
                }
            }
            result = Math.max(result,cnt);
        }
        System.out.println(result);
    }
}