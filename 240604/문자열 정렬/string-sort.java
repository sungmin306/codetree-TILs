import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] c = s.toCharArray();
        Arrays.sort(c);
        //Character[] c2 = Arrays.stream(c).boxed().toArray(Character::new);
        String result = new String(c);
        System.out.println(result);

    }
}