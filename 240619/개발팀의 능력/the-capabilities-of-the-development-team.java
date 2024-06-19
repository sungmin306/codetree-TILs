import java.util.*;
import java.io.*;


public class Main {
    public static int[] arr = new int[5];
    public static int totalSum = 0;

    public static int diff(int i, int j, int k, int h) {
        int sum1 = arr[i] + arr[j];
        int sum2 = arr[k] + arr[h];
        int sum3 = totalSum - sum1 - sum2;

        
        
        int result = Math.abs(sum1 - sum2);
        result = Math.max(result, Math.abs(sum1 - sum3));
        result = Math.max(result, Math.abs(sum2 - sum3));
        
        return result;
    }
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            totalSum += arr[i];
        }


        int minDiff = Integer.MAX_VALUE;
        boolean check = false;
        for(int i = 0; i < 5; i++) {
            for(int j = i + 1; j < 5; j++) {
                for(int k = 0; k < 5; k++) {
                    for(int h = k + 1; h < 5; h++) {
                        if(k == i || k == j || h == i || h == j) continue;
                        int sum1 = arr[i] + arr[j];
                        int sum2 = arr[k] + arr[h];
                        int sum3 = totalSum - sum1 - sum2;
                        if(sum1 == sum2 || sum1 == sum3 || sum2== sum3) continue;
                        else {
                            check = true;
                        }
                        
                        minDiff = Math.min(minDiff, diff(i,j,k,h));

                    } 
                }
            }
        }
        System.out.println((check) ? minDiff : -1);
    }
}