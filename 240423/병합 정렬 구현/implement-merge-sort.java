import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static int[] arr;
    public static int[] mergeArr;
    public static StringBuilder sb = new StringBuilder();

    public static void merge(int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int k = start;
        while(i <= mid && j <= end) {
            if(arr[i] <= arr[j]) mergeArr[k++] = arr[i++];
            else mergeArr[k++] = arr[j++];
        } 

        while( i <= mid) mergeArr[k++] = arr[i++];

        while(j <= end) mergeArr[k++] = arr[j++];

        for(int l = start; l <= end; l++) {
            arr[l] = mergeArr[l];
        }
    }

    public static void mergeSort(int start, int end) {
        if(start < end) {
            int mid = (start + end) / 2;
            mergeSort(start, mid);
            mergeSort(mid + 1, end);
            merge(start, mid, end);
        }
        
    }

    public static void print() {
        for(int i = 0; i < n; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        mergeArr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        mergeSort(0, n -1 );
        print();

    }
}