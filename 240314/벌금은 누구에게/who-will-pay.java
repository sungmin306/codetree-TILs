import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] people = new int[n + 1];
        boolean check = false;
        for(int i  = 0; i < m; i++) {
            int x = Integer.parseInt(br.readLine());
            people[x]++;
            for(int j = 0; j < n + 1; j++) {
                if(people[j] >= k) {
                    System.out.println(x);
                    check = true;
                    break;
                }
            }
            if(check) break;
        }
        if(!check) System.out.println(-1);



    }
}