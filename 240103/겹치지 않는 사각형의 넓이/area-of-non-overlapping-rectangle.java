import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] space = new int[2001][2001];
        for(int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()) + 1000; // 행
            int y1 = Integer.parseInt(st.nextToken()) + 1000; // 열
            int x2 = Integer.parseInt(st.nextToken()) + 1000;
            int y2 = Integer.parseInt(st.nextToken()) + 1000;

            for(int j = x1; j < x2; j++) {
                for(int k = y1; k < y2; k++) {
                    space[j][k] = i+1;
                }
            }
        }
        
        int result = 0;
        for(int i = 0; i < space.length;i++) {
            for(int j = 0; j< space.length;j++) {
                if(space[i][j] == 1 || space[i][j] == 2) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}