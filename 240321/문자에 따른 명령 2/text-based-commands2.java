import java.util.*;
import java.io.*;

public class Main {
    public static int[] dx = {0,1,0,-1};
    public static int[] dy = {1,0,-1,0};
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int dir = 0;
        int x = 0;
        int y = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'L') {
                dir = (dir + 3) % 4;
            }
            else if(c == 'R') {
                dir = (dir + 1) % 4;
            }

            if(c == 'F') {
                x = x + dx[dir];
                y = y + dy[dir];
            }
            
        }
        System.out.println(x + " " + y);
    }
}