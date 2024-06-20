import java.util.*;
import java.io.*;

public class Main {
    public static int N;
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int[] arrX = new int[N];
        int[] arrY = new int[N];
        
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arrX[i] = Integer.parseInt(st.nextToken());
            arrY[i] = Integer.parseInt(st.nextToken());
        }

        int result = Integer.MAX_VALUE;
        int distance = 0;
        for(int i = 0; i < N - 1; i++) {
            for(int j = i + 1; j < N; j++) {
                distance = (arrX[j] - arrX[i]) * (arrX[j] - arrX[i]) + (arrY[j] - arrY[i]) * (arrY[j] - arrY[i]);
            }
            result = Math.min(result, distance);
        }

        System.out.println(result);

    }
}