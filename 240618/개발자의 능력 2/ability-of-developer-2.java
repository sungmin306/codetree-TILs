import java.util.*;
import java.io.*;


public class Main {
    public static int[] arr;
    public static int totalSum = 0;

    public static int diff(int i, int j, int k, int h) {
        int sum1 = arr[i] + arr[j];
        int sum2 = arr[k] + arr[h];
        int sum3 = totalSum - sum1 - sum2;

        int ret = Math.abs(sum1 - sum2);
        ret = Math.max(ret, Math.abs(sum1 - sum3));
        ret = Math.max(ret, Math.abs(sum2 - sum3));

        return ret;
        
    }
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[6];
        

        for(int i = 0; i < 6; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            totalSum += arr[i];
        }

        int minDiff = Integer.MAX_VALUE;

        for(int i = 0; i < 6; i++) {
            for(int j = i + 1; j < 6; j++) {

                for(int k = 0; k < 6; k++) {
                    for(int h = k + 1; h < 6; h++) {
                        if(k == i || k == j || h == i || h == j) continue;
                        minDiff = Math.min(minDiff, diff(i,j,k,h));
                    }
                }
            }
        }

        System.out.println(minDiff);

    }
}