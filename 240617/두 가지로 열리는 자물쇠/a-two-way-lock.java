import java.util.*;
import java.io.*;


public class Main {

    public static int N;
    public static int countfunc(int[] arr,ArrayList<int[]> arrayList) {
        int count = 0;
        for(int i = 0; i < N; i++) {
            if((Math.abs(arr[0] - i) <= 2 || Math.abs(arr[0] - i) >= 8)) {
                for(int j = 0; j < N; j++) {
                    if((Math.abs(arr[1] - j) <= 2 || Math.abs(arr[1] - j) >= 8)) {
                        for(int k = 0; k < N; k++) {
                            if((Math.abs(arr[2] - k) <= 2 || Math.abs(arr[2] - k) >= 8)) {
                                arrayList.add(new int[] {i,j,k});
                                count++;
                            }
                        }
                    }
                }
            }  
        }
        return count;
    }

    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        ArrayList<int[]> arrayList1 = new ArrayList<>();
        ArrayList<int[]> arrayList2 = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 3; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 3; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        
        int sum = countfunc(arr1, arrayList1) + countfunc(arr2,arrayList2);
        int diff = 0;
        for(int i = 0; i < arrayList1.size(); i++) {
            for(int j = 0; j < arrayList2.size(); j++) {
                boolean check = true;
                for(int k = 0; k < 3; k++) {
                    if(arrayList1.get(i)[k] != arrayList2.get(j)[k]) {
                        check = false;
                        break;
                    }
                }
                if(check) diff++;
            }
        }
        System.out.println(sum - diff);

        

        



        
        
    }
}