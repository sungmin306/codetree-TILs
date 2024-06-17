import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[6];
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0; i < 6; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum+= arr[i];
        }
        
        for(int i = 0; i < 6; i++) {
            for(int j = i + 1; j < 6; j++) {
                for(int k = j + 1; k < 6; k++) {
                    int sum1 = arr[i] + arr[j] + arr[k];
                    int diff = sum - sum1;
                    int com = Math.abs(sum1 - diff);
                    min = Math.min(min,com);
                }
            }
        }
        System.out.println(min);
    }
}