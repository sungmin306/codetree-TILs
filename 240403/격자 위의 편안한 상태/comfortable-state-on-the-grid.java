import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static int m;
    public static int[][]map;
    public static int[] dx = {-1,1,0,0};
    public static int[] dy = {0,0,-1,1};

    public static boolean InRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }

    public static boolean check(int x, int y) {
        int checkNum = 0;
        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(InRange(nx,ny) && map[nx][ny] == 1) {
                checkNum++;
            }
            
        }
        if (checkNum == 3) return true;
        else return false;
    }
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][n];
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int x = r - 1;
            int y = c - 1;
            map[x][y] = 1;
            if(check(x,y)) {
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
        }
    }
    
}