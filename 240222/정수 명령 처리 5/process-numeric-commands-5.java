import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s == "push_back") {
                int m = Integer.parseInt(st.nextToken());
                arrayList.add(m);
            }
            else if(s == "pop_back") {
                int m = Integer.parseInt(st.nextToken());
                arrayList.remove(m);
            }
            else if(s == "get") {
                int m = Integer.parseInt(st.nextToken());
                System.out.println(arrayList.get(m));
            }
            else if(s == "size") {
                System.out.println(arrayList.size());
            }
        }
    }
}