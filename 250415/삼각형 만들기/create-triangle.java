import java.util.Scanner;
public class Main {

    public static int[] x;
    public static int[] y;

    public static int area(int i, int j, int k) {
    return Math.abs((x[i] * y[j] + x[j] * y[k] + x[k] * y[i]) - 
                    (x[j] * y[i] + x[k] * y[j] + x[i] * y[k]));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        x = new int[n];
        y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        int sum = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                for(int k = j + 1; k < n; k++) {
                    if(x[i]== x[j] || x[j] == x[k] || x[k] == x[i]) {
                        if(y[i] == y[j] || y[j] == y[k] || y[k] == y[i]) {
                            sum = Math.max(sum, area(i,j,k));
                        }
                    }
                }
            }
        }
        System.out.println(sum);
    }
}