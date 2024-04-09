import java.util.*;
import java.io.*;


public class Main {
    public static int n;
    public static int x,y,nx,ny;

    public static int[][] map;
    public static int[] dx = {0,-1,0,1};
    public static int[] dy = {1,0,-1,0};
    public static int dirNum = 0;

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    public static boolean customRange(int x, int y, int rangeSize) {
        if( x < 0 || x >= n || y < 0 || y >= n) return false;
        return n/2 - rangeSize <= x && x < n/2 + rangeSize  && n/2 - rangeSize  <= y && y < n/2 + rangeSize;
    }


    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        x = n / 2;
        y = n / 2;

        map[x][y] = 1;
        int rangeSize = 2;
        int changeValue = 3;
        for(int i = 2; i <= n * n; i++) {

            nx = x + dx[dirNum];
            ny = y + dy[dirNum];
            // System.out.println(nx + " " + ny);

            if(!customRange(nx,ny, rangeSize)) {
                dirNum = (dirNum + 1) % 4;
            }
            x = x + dx[dirNum];
            y = y + dy[dirNum];
            // System.out.println("x " + x);
            // System.out.println("y " + y);
            map[x][y] = i;


            if(i == changeValue * changeValue) {
                rangeSize++;
                changeValue += 2;
            }
            // System.out.println(Arrays.deepToString(map));


        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}