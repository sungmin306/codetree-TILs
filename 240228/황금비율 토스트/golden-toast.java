import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String s = br.readLine();
        LinkedList<Character> l = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            l.add(s.charAt(i));
        }
        ListIterator<Character> it = l.listIterator(l.size());

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String ans = st.nextToken();
            if(ans.equals("L")) {
                it.previous();
            }
            else if(ans.equals("P")) {
                String input = st.nextToken();
                it.add(input.charAt(0));
            }
            else if(ans.equals("R")) {
                it.next();
            }
            else if(ans.equals("D")) {
                it.next();
                it.remove();
            }
        }

        ListIterator<Character> it2 = l.listIterator();

        while(it2.hasNext())               
            System.out.print(it2.next()); 
    }
}