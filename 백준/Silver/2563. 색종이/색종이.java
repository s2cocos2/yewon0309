import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] canvas = new int[100][100];
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int j=x;j<x+10;j++){
                for(int k=y;k<y+10;k++){
                    canvas[j][k] = 1;
                }
            }
        }

        int answer = 0;
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if(canvas[i][j] == 1){
                    answer++;
                }
            }
        }

        System.out.println(answer);



        }
}