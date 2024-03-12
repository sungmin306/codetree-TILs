import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_T = 2001;
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr1 = new int[MAX_T];
        int[] arr2 = new int[MAX_T];
        int now = 0;
        int timeA = 1;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            char d = st.nextToken().charAt(0);
            int t = Integer.parseInt(st.nextToken());
            while(t --> 0) {
                if(d == 'R') arr1[timeA] =  arr1[timeA - 1] + 1;
                else arr1[timeA] =  arr2[timeA - 1] -1;
                timeA++;
            }
        }
        System.out.println(Arrays.toString(arr1));
        int timeB = 1;
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            char d = st.nextToken().charAt(0);
            int t = Integer.parseInt(st.nextToken());
            while(t --> 0) {
                if(d == 'R') arr2[timeB] =  arr1[timeB - 1] + 1;
                else arr2[timeB] =  arr2[timeB - 1] -1;
                timeB++;
            }
        }

        //System.out.println(Arrays.toString(arr2));

        int result = -1;
        for(int i = 1; i < timeA; i++) {
            if(arr1[i] == arr2[i]) {
                result = i;
                break;
            }    
        }
        System.out.println(result);

    
    }
}