import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if(check(s)) System.out.println("Yes");
        else System.out.println("No");
        
    }

    public static boolean check(String s) {
        Stack<Character> stack = new Stack<>(); 
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == '(') {
                stack.push('(');
            }
            else {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
                else
                    return false;
            }
        }
        if(!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}