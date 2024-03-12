import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        int maxCount = 0;
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(i == 0 || arr[i-1] != arr[i]) cnt = 1;
            else cnt++;
            maxCount = Math.max(maxCount, cnt);

        }
        System.out.println(maxCount);
    }
}