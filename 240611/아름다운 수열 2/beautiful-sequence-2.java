import java.util.*;
import java.io.*;


public class Main {
    public static int N, M;
    public static int[] A;
    public static int[] B;
    public static int[] tmp;

    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        B = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        tmp = new int[N];

        Arrays.sort(B);
        
        int cnt = 0;
        for(int i = 0; i<= N - M; i++) {
            for(int j = 0; j < M; j++) {
                tmp[j] = A[i+j];
            }
            Arrays.sort(tmp,0,M);

            boolean check = true;
            for(int j = 0; j < M; j++) {
                if(tmp[j] != B[j]) {
                    check = false;
                    break;
                }
            }
            if(check) cnt++;
        }

        System.out.println(cnt);

        

        
    }
}