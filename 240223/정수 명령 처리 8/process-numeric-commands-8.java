import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        LinkedList<Integer> linkedList = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("push_back")) {
                int m = Integer.parseInt(st.nextToken());
                linkedList.addLast(m);
            }
            else if(s.equals("push_front")) {
                int m = Integer.parseInt(st.nextToken());
                linkedList.addFirst(m);
            }
            else if(s.equals("pop_front")) {
                System.out.println(linkedList.pollFirst());
            }
            else if(s.equals("front")) {
                System.out.println(linkedList.peekFirst());
            }
            else if(s.equals("pop_back")) {
                System.out.println(linkedList.pollLast());
            }
            else if(s.equals("back")) {
                System.out.println(linkedList.peekLast());
            }
            else if(s.equals("size")) {
                System.out.println(linkedList.size());
            }
            else if(s.equals("empty")) {
                if(linkedList.size() == 0) {
                    System.out.println(1);
                }
                else {
                    System.out.println(0);
                }
            }
        }

    
    }
}