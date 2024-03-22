import java.util.*;
import java.io.*;

public class Main {
    public static int n, t, r, c;
    public static char d;
    public static int[] dx = {-1,0,0,1};  // 북 서 동 남
    public static int[] dy = {0,-1,1,0};
    public static int[][] map;

    public static int direct(char c) {
        if(c == 'U') return 0;
        else if(c == 'L') return 1;
        else if(c == 'R') return 2;
        else return 3;
    }

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = st.nextToken().charAt(0);
        map = new int[n + 1][n + 1];
        r--;
        c--;
        int dir = direct(d);

        while(t --> 0) {
            int nx = r + dx[dir];
            int ny = c + dy[dir];
            if(inRange(nx,ny)) {
                r = nx;
                c = ny;
            }
            else {
                dir = 3 - dir;
            }
        }
        System.out.println((r + 1) + " " + (c + 1));
    }
}