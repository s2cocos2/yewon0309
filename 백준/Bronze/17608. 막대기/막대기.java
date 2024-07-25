import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        int count = 1;
        int max = arr[N-1];

        for(int i=N-2;i>=0;i--){
            if(arr[i] > max){
                count++;
                max = arr[i];
            }
        }




        System.out.println(count);









    }
}
