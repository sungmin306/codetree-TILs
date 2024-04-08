import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("push")) {
                queue.add(Integer.parseInt(st.nextToken()));
            }
            else if(s.equals("pop")) {
                System.out.println(queue.poll());
            }
            else if(s.equals("size")) {
                System.out.println(queue.size());
            }
            else if(s.equals("empty")) {
            if(queue.isEmpty()) System.out.println(1);
            else System.out.println(0);
            }
            else {
                System.out.println(queue.peek());
            }

        }
    }
}