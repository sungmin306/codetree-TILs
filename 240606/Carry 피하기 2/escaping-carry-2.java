import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static int[] arr;
    public static int[][] digitNumber;
    public static ArrayList<Integer> arrayList = new ArrayList<>();
    public static int result = 0;

    public static boolean check() {
        for(int i =0; i < 6; i++) {
            int sum = digitNumber[arrayList.get(0)][i] + digitNumber[arrayList.get(1)][i] + digitNumber[arrayList.get(2)][i];
            if(sum >= 10) return false;
        }
        return true;
    }

    public static void dfs(int v, int h) {
        if(h == 3) {
            if(check()) {
                int sum = 0;
                for(int i = 0; i < 3; i++) {
                    sum += arr[arrayList.get(i)];
                }
                result = Math.max(result, sum);
            }
            return;
        }
        for(int i = v; i < n; i++) {
            arrayList.add(i);
            dfs(i + 1, h + 1);
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        digitNumber = new int[n][6];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            int cnt = 0;
            int temp = arr[i];
            while(temp != 0) {
                int n = temp % 10;
                digitNumber[i][cnt] = n;
                temp = temp / 10;
                cnt++;
            }
        }
        dfs(0,0);
        System.out.println(result==0 ? -1 : result);
    }
}