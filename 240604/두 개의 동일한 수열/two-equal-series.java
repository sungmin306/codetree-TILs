import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int[] arr2 = new int[n];
        for(int i = 0; i < n; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        check(arr1, arr2);

    }

    public static void check(int[] arr1, int[] arr2) {
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        return;
    }
}