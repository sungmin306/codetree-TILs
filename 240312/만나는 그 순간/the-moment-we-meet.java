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
        int index = 1;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            char d = st.nextToken().charAt(0);
            int t = Integer.parseInt(st.nextToken());
            if(d == 'R') {
                while(t --> 0) {
                    now++;         
                    arr1[index] = now;
                    index++;
                }
            }
            else if(d == 'L') {
                while(t --> 0) {
                    now--;
                    arr1[index] = now;
                    index++;
                }
            }
        }

        //System.out.println(Arrays.toString(arr1));
        now = 0;
        index = 1;
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            char d = st.nextToken().charAt(0);
            int t = Integer.parseInt(st.nextToken());
            if(d == 'R') {
                while(t --> 0) {
                    now++;
                    arr2[index] = now;
                    index++;
                }
            }
            else if(d == 'L') {
                while(t --> 0) {
                    now--;
                    arr2[index] = now;
                    index++;
                }
            }
        }

        //System.out.println(Arrays.toString(arr2));


        for(int i = 0; i < MAX_T; i++) {
            if(arr1[i] != 0 && arr1[i] == arr2[i]) {
                System.out.println(i);
                break;
            }    
        }

    
    }
}