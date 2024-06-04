import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for(int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        Arrays.sort(arr);
        print(arr);
        // Arrays.sort(arr,Collections.reverseOrder());
        // print(arr);

    }
    public static void print(String[] s) {
        for(int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}