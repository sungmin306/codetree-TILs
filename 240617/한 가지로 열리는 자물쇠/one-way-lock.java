import java.util.*;
import java.io.*;



public class Main {

    public static int N;
    public static int[] arr = new int[3];

    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;

        for(int i = 1; i <= N; i++) {
            if(Math.abs(arr[0] - i) > 2) {
                for(int j = 1; j <= N; j++) {
                    if(Math.abs(arr[1] - j) > 2) {
                        for(int k = 1; k <= N; k++) {
                            if(Math.abs(arr[2] - k) > 2) {
                                sum++;
                            }
                        }
                    }
                }
                    
            }
        }

        System.out.println((N * N * N) - sum);
    }
}