import java.util.*;
import java.io.*;

public class Main {
    public static final int OFFSET = 100;
    public static final int MAX_R = 200;
    public static final int[][] map = new int[MAX_R + 1][MAX_R + 1];

    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()) + OFFSET;
            int y1 = Integer.parseInt(st.nextToken()) + OFFSET;
            int x2 = Integer.parseInt(st.nextToken()) + OFFSET;
            int y2 = Integer.parseInt(st.nextToken()) + OFFSET;
            
            for(int x = x1; x < x2; x++) {
                for(int y = y1; y < y2; y++) {
                    if(i % 2 == 0) { // 빨간색
                        map[x][y] = 1;
                    }
                    else { // 파란색
                        map[x][y] = 2;
                    }
                }

            }
        }
        int result = 0; 

        for(int i = 0; i < MAX_R; i++) {
            for(int j = 0; j < MAX_R; j++) {
                if(map[i][j] == 2) result++;
            }
        }
        System.out.println(result);
    }
}