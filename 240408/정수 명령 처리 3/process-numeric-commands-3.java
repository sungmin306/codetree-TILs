import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("push_front")) {
                deque.addFirst(Integer.parseInt(st.nextToken()));
            }
            else if(s.equals("push_back")) {
                deque.addLast(Integer.parseInt(st.nextToken()));
            }
            else if(s.equals("pop_front")) {
                System.out.println(deque.pollFirst());
            }
            else if(s.equals("pop_back")) {
                System.out.println(deque.pollLast());
            }
            else if(s.equals("empty")) {
                if(deque.isEmpty()) System.out.println(1);
                else System.out.println(0);
            }
            else if(s.equals("size")) {
                System.out.println(deque.size());
            }
            else if(s.equals("front")) {
                System.out.println(deque.peekFirst());
            }
            else {
                System.out.println(deque.peekLast());
            }

        }
    }
}