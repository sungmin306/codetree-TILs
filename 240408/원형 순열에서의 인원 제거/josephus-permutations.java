import java.util.*;
import java.io.*;


public class Main {
    public static void printCircle(int n , int k) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= n; i++) {
            queue.add(i);
        }
        Queue<Integer> newQueue = new LinkedList<>();
        while(queue.size() != 1) {
            for(int i = 0; i < k - 1; i++) {
                queue.add(queue.poll());
            }
            System.out.print(queue.poll() + " ");

        }
        System.out.print(queue.poll() + " ");

        
        
    }
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        printCircle(n, k);

        

    }
}