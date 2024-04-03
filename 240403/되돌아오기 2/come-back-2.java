import java.util.*;
import java.io.*;

public class Main {
    public static int[] dx = {1,0,-1,0}; // 동 남 서 북 
    public static int[] dy = {0,-1,0,1};
    public static String s;
    public static int currDir = 3;
    public static int x = 0, y = 0;

    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();

        boolean flag = false;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == 'L') {
                currDir = (currDir - 1 + 4) % 4;
            }
            else if (c == 'R')
                currDir = (currDir + 1) % 4;
            else {
                x += dx[currDir];
                y += dy[currDir];
            }

            if(x == 0 && y == 0) {
                System.out.println(i + 1);
                flag = true;
                break;
            }
            
        }

        if(flag == false) System.out.print(-1);
    }
}