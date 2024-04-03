import java.util.*;
import java.io.*;

public class Main {
    public static int n,k;
    public static int x,y, moveDir;
    public static int[] dx = {1,0,-1,0};
    public static int[] dy = {0,-1,0,1};
    public static char[][] map;


    public static void initialize(int num) {
        if(num <= n) {
            x = 0;
            y = num -1;
            moveDir = 0;
        }
        else if(num <= 2*n) {
            x = num - n - 1;
            y = n - 1;
            moveDir = 1;
           
        }
        else if (num <= 3*n) {
            x = n - 1;
            y = n - (num - 2 * n);
            moveDir = 2;
           
        }
        else {
            x = n - (num - 3 * n);
            y = 0;
            moveDir = 3;
        }
    }

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    public static void move(int nextDir) {
        x += dx[nextDir];
        y += dy[nextDir];
        moveDir = nextDir;
    }

    public static int simulate() {
        int moveNum = 0;
        while(inRange(x,y)) {

            if(map[x][y] == '/') move(moveDir ^ 1);
            else move(3 - moveDir);

            moveNum += 1;
        }
        return moveNum;
    }

    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new char[n][n];
        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            for(int j = 0; j < n; j++) {
                map[i][j] = s.charAt(j);
            }
        }
        k = Integer.parseInt(br.readLine());
        initialize(k);
        int moveNum = simulate();

        System.out.println(moveNum);
        
    }
}