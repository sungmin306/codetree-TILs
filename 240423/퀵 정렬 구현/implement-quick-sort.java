import java.util.Scanner;

public class Main {
    public static final int MAX_N = 100000;
    
    public static int n;
    public static int[] arr = new int[MAX_N];
    public static int[] mergedArr = new int[MAX_N];

    public static int partition(int low, int high) {
        int pivot = arr[high];              
        int i = low - 1;                    
                                           

        for(int j = low; j < high; j++)    
            if(arr[j] < pivot) {            
                i++;                        
                int temp = arr[i];         
                arr[i] = arr[j];
                arr[j] = temp;       
            }
        
        int temp = arr[i + 1];             
        arr[i + 1] = arr[high];            
        arr[high] = temp;                   
                                           
        return i + 1;                   
    }

    public static void quickSort(int low, int high) {
        if(low < high) {                   
            int pos = partition(low, high); 
                                            
            quickSort(low, pos - 1);        
            quickSort(pos + 1, high);      
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력
        n = sc.nextInt();
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        quickSort(0, n - 1);

        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}