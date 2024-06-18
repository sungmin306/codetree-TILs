import java.util.*;
import java.io.*;

public class Main {
    public static int N;
    public static int[] a;
    public static int[] b;
    public static int[] c;

    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        a = new int[N];
        b = new int[N];
        c = new int[N];
        
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
            c[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;

        for(int i = 1; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                for(int k = 1; k < 10; k++) {
                    if(i == j || j == k || k == i) continue;

                    boolean check = true;
                    for(int q = 0; q < N; q++) {
                        int x = a[q] / 100;
                        int y = a[q] / 10 % 10;
                        int z = a[q] % 10;

                        int cnt1 = 0, cnt2 = 0;

                        if(x == i) cnt1++;
                        if(y == j) cnt1++;
                        if(z == k) cnt1++;
                        if(x == j || x == k) cnt2++;
                        if(y == i || y == k) cnt2++;
                        if(z == i || z == j) cnt2++;

                        if(cnt1 != b[q] || cnt2 != c[q]) {
                            check = false;
                            break;
                        }
                    }
                    if(check) cnt++;
                }
            }
        }   
        System.out.println(cnt);
    }
}