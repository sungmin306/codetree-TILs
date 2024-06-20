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

        int result= Integer.MAX_VALUE;

        for(int i = 0; i < N; i++) {
            int sx = 50000;
            int sy = 50000;
            int lx = 0;
            int ly = 0;
            for(int j = 0; j < N; j++) {
                if(i == j) continue;
                if(arrX[j] < sx) sx = arrX[j];
                if(arrY[j] < sy) sy = arrY[j];
                if(arrX[j] > lx) lx = arrX[j];
                if(arrY[j] > ly) ly = arrY[j];
            }
            result = Math.min(result,(lx - sx) * (ly - sy));
            
        }

        System.out.println(result);

    }
}