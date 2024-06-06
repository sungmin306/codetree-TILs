import java.util.*;
import java.io.*;

public class Main {
    public static int[][] map = new int[19][19]; 
    public static boolean[][] visited = new boolean[19][19];
    public static int[] dx = {-1,-1,0,1,1,1,0,-1};
    public static int[] dy = {0,1,1,1,0,-1,-1,-1};
    public static int midX = 0;
    public static int midY = 0;

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < 19 && 0 <= y && y < 19;
    }

    public static boolean search(int x, int y, int a) {
        visited[x][y] = true;
        for(int i = 0; i < 8; i++) {
            int nx = x;
            int ny = y;
            int cnt = 1;
            for(int j = 0; j < 4; j++) {
                if(j == 1) {
                    midX = x;
                    midY = y;
                }
                nx = nx + dx[i];
                ny = ny + dy[i];
                if(!inRange(nx,ny)) break;
                if(map[nx][ny] == a && !visited[nx][ny]){
                    cnt++;
                    visited[nx][ny] = true;
                } 
            }
            if(cnt == 5) return true;
        }
        return false;
    }
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 19; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 19; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i< 19; i++) {
            for(int j = 0; j < 19; j++) {
                if(visited[i][j]) continue;
                if(map[i][j] == 1 || map[i][j] == 2) {
                    if(search(i,j,map[i][j])) {
                        System.out.println(map[i][j]);
                        System.out.println(midX + " " + midY);
                        break;
                    }
                }
            }
        }

        



        

    }
}import java.util.Scanner;

public class Main {
    public static final int DIR_NUM = 8;
    
    public static int[][] arr = new int[19][19];
    
    public static int[] dx = new int[]{1, 1, 1, -1, -1, -1, 0, 0};
    public static int[] dy = new int[]{-1, 0, 1, -1, 0, 1, -1, 1};
    
    public static boolean inRange(int x, int y) {
        return 0 <= x && x < 19 && 0 <= y && y < 19;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        for(int i = 0; i < 19; i++)
            for(int j = 0; j < 19; j++)
                arr[i][j] = sc.nextInt();
        
        // 모든 좌표에서 다 확인해봅니다.
        for(int i = 0; i < 19; i++) {
            // 격자를 벗어나지 않을 범위로만 잡습니다.
            for(int j = 0; j < 19; j++) {
                if(arr[i][j] == 0) continue;
                
                for(int k = 0; k < DIR_NUM; k++) {
                    int curt = 1;
                    int curx = i;
                    int cury = j;
                    while(true) {
                        int nx = curx + dx[k];
                        int ny = cury + dy[k];
                        if(inRange(nx, ny) == false)
                            break;
                        if(arr[nx][ny] != arr[i][j])
                           break;
                        curt++;
                        curx = nx;
                        cury = ny;
                    }
                    if(curt == 5) {
                        System.out.println(arr[i][j]);
                        System.out.print((i + 2 * dx[k] + 1) + " " + (j + 2 * dy[k] + 1));
                        System.exit(0);
                    }
                }
            }
        }
        System.out.print(0);
    }
}