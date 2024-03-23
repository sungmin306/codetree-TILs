import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static int m;
    public static int[][] map;
    public static int x = 0, y = 0;
    public static int[] dx = {0,1,0,-1};
    public static int[] dy = {1,0,-1,0};
    public static int direct = 0;
    
    public static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < m);
    }
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());  
        map = new int[n][m];

        map[x][y] = 1;

        for(int i = 2; i <= n * m; i++) {
            int nx = x + dx[direct];
            int ny = y + dy[direct];

            if(!inRange(nx,ny) || map[nx][ny] != 0) direct = (direct + 1) % 4;

            x = x + dx[direct];
            y = y + dy[direct];
            map[x][y] = i;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }
}