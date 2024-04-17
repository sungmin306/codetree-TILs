import java.util.*;
import java.io.*;

public class Main {
    public static String s;
    public static char[] arr;

    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();
        arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == '0') {
                arr[i] = '1';
                break;
            }
        }
        //System.out.println(Arrays.toString(arr));    
        System.out.println(calculator());   
        
    }

    public static int calculator() {
        if(arr.length == 1) {
            return 0;
        }
        int sum = 0;
        for(int i = 0 ; i < arr.length; i++) {
            if(arr[i] == '1') {
                sum += Math.pow(2, ((arr.length) - i - 1));
                //System.out.println(sum);
            }
        }
        return sum;
    }
}