import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= n; i++) {
            deque.addLast(i);
        }

        while(deque.size() != 1) {
            deque.pollFirst();
            deque.addLast(deque.pollFirst());
        }
        System.out.println(deque.pollLast());
        
        
    }
}