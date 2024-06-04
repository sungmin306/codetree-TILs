import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int result = 0;
        for(int i = 0; i < N-2; i++) {
            char c1 = s.charAt(i);
            if(c1 == 'C') {
                for(int j = i+1; j < N - 1; j++) {
                    char c2 = s.charAt(j);
                    if(c2 == 'O') {
                        for(int k = j+1; k < N; k++) {
                            char c3 = s.charAt(k);
                            if(c3 == 'W') {
                                result++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(result);

    }
}