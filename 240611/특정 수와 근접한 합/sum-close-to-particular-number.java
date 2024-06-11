import java.util.*;
import java.io.*;

public class Main {

    public static int N, S;
    public static int distance = 100000000;
    public static int[] arr;

    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        arr = new int[N];
        int totalSum = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            totalSum += arr[i];
        }
        int n1 = 0;
        int n2 = 0;
        for(int i = 0; i < N - 1; i++) {
            for(int j = i + 1; j < N; j++) {
                int num = arr[i] + arr[j];
                int temp = totalSum - num;
                if(distance > Math.abs(S - temp)) {
                    distance = Math.abs(S - temp);
                    n1 = arr[i];
                    n2 = arr[j];
                }
            }
        }
        // System.out.println(n1);
        // System.out.println(n2);


        System.out.println(Math.abs(S - (totalSum - (n1 + n2))));
    }
}