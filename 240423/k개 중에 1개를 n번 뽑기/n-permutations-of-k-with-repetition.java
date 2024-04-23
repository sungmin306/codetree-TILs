import java.util.*;
import java.io.*;


public class Main {
    public static int k , n;
    public static ArrayList<Integer> arrayList = new ArrayList<>();
    public static StringBuilder sb = new StringBuilder();

    public static void print() {
        for(int i = 0; i < arrayList.size(); i++) {
            sb.append(arrayList.get(i)).append(" ");
        }
        sb.append("\n");
    }

    public static void dfs(int h) {

        if(h == n + 1) {
            print();
            return;
        }
        
        for(int i = 1; i <= k; i++) {
            arrayList.add(i);
            dfs(h + 1);
            arrayList.remove(arrayList.size() - 1);
        }

    }
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        k = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());


        dfs(1);

        System.out.println(sb);

    }
}