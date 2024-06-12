import java.util.*;
import java.io.*;


public class Main {
    public static int N, H, T;
    public static int[] arr;
    public static int result= 1000000000;
    
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());
        
        arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N-T; i++) {
            int temp = 0;
            for(int j = 0; j<T; j++) {
                temp += Math.abs(H - arr[j+i]);
            }
            result = Math.min(result, temp);
        }
        System.out.println(result);
    }
}