import java.util.*;
import java.io.*;


public class Main {
    public static final int MAXVALUE = 101;
    public static int N;
    public static char[] arr = new char[MAXVALUE];
    public static int result = 0;

    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);
            arr[a] = c;
        }


        for(int i = 0; i < MAXVALUE - 1; i++) {
            if(arr[i] == 'G' || arr[i] == 'H') {
                int cntG = 0;
                int cntH = 0;
                if(arr[i] == 'G') cntG++;
                else if(arr[i] == 'H') cntH++;
                for(int j = i + 1; j < MAXVALUE; j++) {
                    if(arr[j] == 'G') cntG++;
                    else if(arr[j] == 'H') cntH++;
                    if(arr[j] == 'G' || arr[j] == 'H') {
                        if(cntG != 0 && cntH == 0) {
                        result = Math.max(result, j - i);
                        }
                        else if(cntG == 0 && cntH != 0) {
                            result = Math.max(result, j - i);
                        }
                        else if(cntG == cntH) {
                            result = Math.max(result, j - i);
                        }
                    }
                }
            }
        }
        System.out.println(result);   
    }
}