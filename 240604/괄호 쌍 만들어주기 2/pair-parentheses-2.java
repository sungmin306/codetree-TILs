import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int result = 0;
        for(int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == '(' && s.charAt(i+1) == '(') {
                for(int j = i; j < s.length() - 1; j++) {
                    if(s.charAt(j) == ')' && s.charAt(j+1) == ')') {
                        result++;
                    }
                }
            }
            
        }
        System.out.println(result);
    }
}