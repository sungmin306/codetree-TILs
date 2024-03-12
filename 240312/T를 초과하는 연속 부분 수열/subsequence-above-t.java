import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] =  Integer.parseInt(st.nextToken());
        }

        int maxCount = 1;
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] <= t) cnt = 0;
            else cnt++;
            maxCount = Math.max(maxCount, cnt);
        }
        System.out.println(maxCount);
    }
}