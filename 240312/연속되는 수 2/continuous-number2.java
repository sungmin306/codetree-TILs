import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(i == 0 || arr[i-1] != arr[i]) {
                arrayList.add(i);
            }
        }
        int maxCount = 1;
        for(int i = 0; i < arrayList.size() -1; i++) {
            int temp = arrayList.get(i+1) - arrayList.get(i);
            maxCount = Math.max(maxCount, temp);
        }
        System.out.println(maxCount);
    }
}