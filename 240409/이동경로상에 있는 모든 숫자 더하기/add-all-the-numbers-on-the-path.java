import java.util.*;
import java.io.*;


public class Main {
    public static int n , t;
    public static int x, y;
    public static int nx, ny;
    public static String s;
    public static int[][] map;
    public static int dirNum = 0;
    public static int[] dx = {-1,0,1,0};
    public static int[] dy = {0,1,0,-1};

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(st.nextToken());
        s = br.readLine();
        map = new int[n][n];
        x = n / 2;
        y = n / 2;

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int sum = map[x][y];

        for(int i = 0; i < t; i++) {
            char c = s.charAt(i);

            if(c == 'R') {
                dirNum = (dirNum + 1) % 4;
            }
            else if(c == 'L') {
                dirNum = (dirNum - 1 + 4) % 4;
            }
            else {
                nx = x + dx[dirNum];
                ny = y + dy[dirNum];
                if(!inRange(nx,ny)) {
                    continue;
                }
                x = nx;
                y = ny;
                sum += map[x][y];
            }
        }
        System.out.println(sum);
    }
}