import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int[][] arr;
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][2];
        int count = 0;
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        //Arrays.sort(arr, (a,b) -> a[0] - b[0]);
        Arrays.sort(arr, (a,b) -> Integer.compare(a[0],b[0]));
        boolean[] check = new boolean[N];
        for(int i = 0; i < N; i++) {
            int s = arr[i][0];
            int f = arr[i][1];
            for(int j = i + 1; j < N; j++) {
                if(arr[j][0] == s || arr[j][1] <= f) {
                    check[i] = true;
                    check[j] = true;
                    break;
                }
            }
        }
        for(int i = 0; i < N; i++) {
            if(!check[i]) count++;
        }
        System.out.println(count);

    }
}