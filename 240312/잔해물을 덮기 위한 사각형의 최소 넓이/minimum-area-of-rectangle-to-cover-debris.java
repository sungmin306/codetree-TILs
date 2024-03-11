import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[][] map = new int[2001][2001];
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        
        for(int i = x1 + 1000; i < 1000 + x2; i++) {
            for(int j = y1 + 1000; j < 1000 + y2; j++) {
                map[i][j] = 1;
            }
        }
        st = new StringTokenizer(br.readLine());
        x1 = Integer.parseInt(st.nextToken());
        y1 = Integer.parseInt(st.nextToken());
        x2 = Integer.parseInt(st.nextToken());
        y2 = Integer.parseInt(st.nextToken());

        for(int i = x1 + 1000; i < 1000 + x2; i++) {
            for(int j = y1 + 1000; j < 1000 + y2; j++) {
                map[i][j] = 2;
            }
        }
        int minX = 2001, maxX = 0, minY = 2001, maxY = 0;
        boolean findArea = false;
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map.length; j++) {
                if(map[i][j] == 1) {
                    findArea = true;
                    minX = Math.min(minX, i);
                    maxX = Math.max(maxX, i);
                    minY = Math.min(minY, j);
                    maxY = Math.max(maxY, j);
                }
            }
        }
        int result;
        if(!findArea) result = 0;
        else result = (maxX - minX + 1) * (maxY - minY + 1);

        System.out.println(result);
    }
}