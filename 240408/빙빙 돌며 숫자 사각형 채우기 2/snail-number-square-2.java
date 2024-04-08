import java.util.Scanner;

public class Main {
    public static final int DIR_NUM = 4;
    public static final int MAX_N = 100;
    
    public static int n, m;
    public static int[][] arr = new int[MAX_N][MAX_N];
    
    public static int[] dx = new int[]{0, 1,  0, -1};
    public static int[] dy = new int[]{1, 0, -1,  0};
    
    public static int currX, currY;  
    public static int dir = 1;       
    
    public static boolean inRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();


        arr[currX][currY] = 1;

        for(int i = 2; i <= n * m; i++) { 
            while(true) { 

                int nx = currX + dx[dir];
                int ny = currY + dy[dir];

                if(inRange(nx, ny) && arr[nx][ny] == 0) {

                    currX = nx; 
                    currY = ny;
                    arr[currX][currY] = i;
                    break;
                } else {

                    dir = (dir + 3) % 4;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) 
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}