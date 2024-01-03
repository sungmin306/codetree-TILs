import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] checkArr = new int[200][200];
        
        for(int i = 0; i < n; i++) { // 입력
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            
            for(int j = x1; j < x2; j++) {
                for(int k = y1; k < y2; k++) {
                    checkArr[j][k] = 1;
                }
            }
        }
        int result = 0;
        for(int i = 0; i < checkArr.length; i++) {
            for(int j = 0; j < checkArr.length; j++) {
                if(checkArr[i][j] == 1) result++;
            }
        }
        System.out.println(result);
    }
}