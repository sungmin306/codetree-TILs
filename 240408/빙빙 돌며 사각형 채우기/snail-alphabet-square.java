import java.util.*;
import java.io.*;

public class Main {

    public static int n, m;
    public static char[][] map;
    public static boolean[][] visited;
    
    public static int[] dx = {0,1,0,-1};
    public static int[] dy = {1,0,-1,0};
    public static int dirNum = 0;
    public static int alphaNum = 65;


    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < m;
    }

    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new char[n][m];
        visited = new boolean[n][m];

        int x = 0;
        int y = 0;
        map[x][y] = (char) alphaNum;
        visited[x][y] = true;

        
        for(int i = 1; i < n * m; i++) {
            while(true) {
                int nx = x + dx[dirNum];
                int ny = y + dy[dirNum];

                if(inRange(nx,ny) && visited[nx][ny] == false) {
                    x = nx;
                    y = ny;
                    visited[x][y] = true;
                    map[x][y] = (char)(i % 26 + 65);
                    break;
                }
                else {
                    dirNum = (dirNum + 1) % 4;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}