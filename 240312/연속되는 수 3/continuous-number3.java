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
        int maxCount = 1;
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(i != 0) {
                if(arr[i-1] < 0) {
                    if(arr[i] > 0) cnt = 0; 
                }
                else if(arr[i-1] > 0) {
                    if(arr[i] < 0) cnt = 0;
                }
            }
            cnt++;
            // System.out.println("cnt " + cnt);
            maxCount = Math.max(cnt, maxCount);
        }
        System.out.println(maxCount);
    }
}