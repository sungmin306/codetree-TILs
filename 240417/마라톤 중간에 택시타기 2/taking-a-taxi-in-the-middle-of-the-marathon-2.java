import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static int x, y;

    public static ArrayList<Integer> dx;
    public static ArrayList<Integer> dy;

    
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dx = new ArrayList<>();
        dy = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            dx.add(x);
            dy.add(y);
        }

        int distance = Integer.MAX_VALUE;
        for(int i = 1; i < n - 1; i++) {
            int tempX = dx.get(i);
            int tempY = dy.get(i);
            dx.remove(i);
            dy.remove(i);
            int sum = 0;
            // print(dx);
            // print(dy);
            for(int j = 0; j < dx.size() -1; j++) {
                sum += Math.abs(dx.get(j) - dx.get(j+1)) + Math.abs(dy.get(j) - dy.get(j+1)); 
            }
            distance = Math.min(distance, sum);
            dx.add(i,tempX);
            dy.add(i,tempY);
        }
        System.out.println(distance);
        
    }
    public static void print(ArrayList<Integer> arrayList) {
        for(int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
    }
}