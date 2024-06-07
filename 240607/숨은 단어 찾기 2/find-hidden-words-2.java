import java.util.*;
import java.io.*;

public class Main {
    public static int N, M;
    public static char[][] map;
    public static int result = 0;

    public static int[] dx = {-1,-1,0,1,1,1,0,-1};
    public static int[] dy = {0,1,1,1,0,-1,-1,-1};
    public static boolean inRange(int x, int y) {
        return 0 <= x && x < N && 0 <= y && y < M;
    }

    public static void check(int x, int y) {
        for(int i = 0; i < 8; i++) {
            int nx = x;
            int ny = y;
            boolean checkValue = true;
            for(int j = 1; j < 3; j++) {
                nx = nx + dx[i];
                ny = ny + dy[i];
                if(!inRange(nx,ny) || map[nx][ny] != 'E') {
                    checkValue = false;
                    break;
                }

            }
            if(checkValue) result++;
        }
    }
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new char[N][M];

        for(int i = 0; i < N; i++) {
            String s = br.readLine();
            for(int j = 0; j < M; j++) {
                map[i][j] = s.charAt(j);
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(map[i][j] == 'L') {
                    check(i,j);
                }
            }
        }

        System.out.println(result);

    }
}