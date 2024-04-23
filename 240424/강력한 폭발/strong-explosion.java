import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static int [][] map;
    public static int [][] realMap;
    public static int cnt;
    public static int result = 0;
    public static ArrayList<int[]> arrayList = new ArrayList<>();
    public static ArrayList<Integer> boom = new ArrayList<>();

    public static int[] oneDx = {-1,-2,1,2};
    public static int[] twoDx = {-1,0,1,0};
    public static int[] twoDy = {0,1,0,-1};
    public static int[] threeDx = {-1,-1,1,1};
    public static int[] threeDy = {-1,1,1,-1};

    public static void changeMap() {
        map = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                map[i][j] = realMap[i][j];
            }
        }
    }

    public static boolean inRange(int x,  int y) {
        return  0 <= x && x < n && 0 <= y && y < n;
    }

    public static void countMap() {
        int count  = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(map[i][j] == 1) count++;
            }
        }
        result = Math.max(result, count);
    }

    public static void checkMap(int x, int y, int v) {
        if(v == 1) {
            for(int i = 0; i < 4; i++) {
                int nx = x + oneDx[i];
                if(inRange(nx,y)) {
                    map[nx][y] = 1;
                }
            }
        }
        else if(v == 2) {
            for(int i = 0; i < 4; i++) {
                int nx = x + twoDx[i];
                int ny = y + twoDy[i];
                if(inRange(nx,ny)) {
                    map[nx][ny] = 1;
                }
            }

        }
        else {
            for(int i = 0; i < 4; i++) {
                int nx = x + threeDx[i];
                int ny = y + threeDy[i];
                if(inRange(nx,ny)) {
                    map[nx][ny] = 1;
                }
            }
        }
        countMap();
    }

    public static void setBoom() {
        for(int i = 0; i < arrayList.size(); i++) {
            int[] now = arrayList.get(i);
            int nowX = now[0];
            int nowY = now[1];
            checkMap(nowX, nowY, boom.get(i));
        }
    }


    public static void dfs(int h) {
        if(h == cnt) {
            setBoom();
            changeMap();
            return;
        }

        for(int i = 1; i <= 3; i++) {
            boom.add(i);
            dfs(h + 1);
            boom.remove(boom.size() - 1);
        }

    }

    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        cnt = 0;
        realMap = new int[n][n];
        map = new int[n][n];
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                realMap[i][j] = Integer.parseInt(st.nextToken());
                map[i][j] = realMap[i][j];
                if(realMap[i][j] == 1) {
                    cnt++;
                    arrayList.add(new int[] {i,j});
                }
            }
        }

        dfs(0);
        System.out.println(result);
    }
}