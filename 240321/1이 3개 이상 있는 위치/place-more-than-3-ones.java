import java.util.*;
import java.io.*;

public class Main {

    
    public static int MAX_N = 101;
    public static int n;
    public static int[][] map = new int[MAX_N][MAX_N];
    public static int[] dx = {-1,1,0,0};
    public static int[] dy = {0,0,-1,1};

    public static boolean inRange(int x, int y) {
        return (x >= 0 && x < n && y >= 0 && y < n);
    }

    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        //map = new int[n][n];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int result = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int cnt = 0;
                for(int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(inRange(nx,ny) && map[nx][ny]==1) cnt++;
                }
                if(cnt >= 3) result ++;
            }
        }
        System.out.println(result);

    }
}