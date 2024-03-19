import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // N명 개발자
        int K = Integer.parseInt(st.nextToken()); // 전염병 옮기는 횟수
        int P = Integer.parseInt(st.nextToken()); // 처음 전염병 걸린 개발자
        int T = Integer.parseInt(st.nextToken()); // Testcase

        Person[] people = new Person[N+1];
        for(int i = 1; i < N+1; i++) {
            if(i == P) {
                people[i] = new Person(1,K);
            }
            else people[i] = new Person(0,0);
        }
        Test[] tests = new Test[T];
        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            tests[i] = new Test(t,x,y);
        }
        Arrays.sort(tests, (t1,t2) -> Integer.compare(t1.t, t2.t));
        
        for(int i = 0; i < tests.length; i++) {
            int x = tests[i].x;
            int y = tests[i].y;
            if(people[x].g == 1 && people[x].k != 0) {
                if(people[y].g == 1) {
                    if(people[y].k != 0) {
                        people[x].k--;
                        people[y].k--;
                    }
                    else {
                        people[x].k--;
                    }
                }
                else {
                    people[y].g = 1;
                    people[y].k = K;
                }
            }
            if(people[y].g == 1 && people[y].k != 0) {
                if(people[x].g == 1) {
                    if(people[x].k != 0) {
                        people[y].k--;
                        people[x].k--;
                    }
                    else {
                        people[y].k--;
                    }
                }
                else {
                    people[x].g = 1;
                    people[x].k = K;
                }
            }
            
        }
        for(int i = 1; i < N + 1; i++) {
            System.out.print(people[i].g);
        }
    }
}

class Person {
    int g;
    int k;

    public Person(int g, int k) {
        this.g = g;
        this.k = k;
    }
}
class Test {
    int t;
    int x;
    int y;

    public Test(int t, int x, int y) {
        this.t = t;
        this.x = x;
        this.y = y;
    }

}