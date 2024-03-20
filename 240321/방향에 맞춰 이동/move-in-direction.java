import java.util.*;
import java.io.*;


public class Main {
    public static int[] dx = {-1,1,0,0}; // 서 동 남 북
    public static int[] dy = {0,0,-1,1};
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        int y = 0;
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char s = st.nextToken().charAt(0);
            int d = Integer.parseInt(st.nextToken());
            if(s == 'N') { // 북
                while(d --> 0) {
                    x = x + dx[3];
                    y = y + dy[3];
                }
            }
            else if(s == 'S') { // 남
                while(d --> 0) {
                    x = x + dx[2];
                    y = y + dy[2];
                }
            }
            else if(s == 'W') { // 서
                while(d --> 0) {
                    x = x + dx[0];
                    y = y + dy[0];
                }
            }
            else if(s == 'E') { // 동
                while(d --> 0) {
                    x = x + dx[1];
                    y = y + dy[1];
                }
            }
        }
        System.out.println(x + " " + y);


    }
}