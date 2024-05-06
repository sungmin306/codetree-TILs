import java.util.Scanner;

public class Main {
    public static final int MAX_N = 100000;
    
    public static int n;
    public static int[] arr = new int[MAX_N];
    public static int[] mergedArr = new int[MAX_N];

    public static void heapify(int n, int i) {
        int largest = i;                  
        int l = i * 2;                     
        int r = i * 2 + 1;                  

        if(l <= n && arr[l] > arr[largest]) 
            largest = l;
        
        if(r <= n && arr[r] > arr[largest]) 
            largest = r;
        
        if(largest != i) {                  
            int temp = arr[i];             
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(n, largest);            
        }
    }

    public static void heapSort() {
        // 1. max-heap을 만들어 줍니다.
        for(int i = n / 2; i >= 1; i--)    
            heapify(n, i);                 

        // 2. 정렬을 진행합니다.
        for(int i = n; i > 1; i--) {      
            int temp = arr[1];             
            arr[1] = arr[i];
            arr[i] = temp;
            heapify(i - 1, 1);             
        }                                 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력
        n = sc.nextInt();
        for(int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        
        heapSort();

        for(int i = 1; i <= n; i++)
            System.out.print(arr[i] + " ");
    }
}