import java.util.*;
import java.io.*;

public class Main {

    public static int n;
    public static int x,y;
    public static int moveDir, moveNum;
    public static int[][] map;

    public static int[] dx = {0,-1,0,1};
    public static int[] dy = {1,0,-1,0}; 

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];

        x = n / 2;
        y = n / 2;
        moveDir = 0;
        moveNum = 1;

        int cnt = 1;

        while(inRange(x,y)) {
            
            for(int i = 0; i < moveNum; i++) {
                map[x][y] = cnt++;
                x = x + dx[moveDir];
                y = y + dy[moveDir];
                
                if(!inRange(x,y)) break;
            }

            moveDir = (moveDir + 1) % 4; 
            if(moveDir == 0 || moveDir == 2) moveNum++;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}