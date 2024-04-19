import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        for(int num=0;num<N;num++){
            arr[num] = num+1;
        }

        int i = 0;
        int j = 0;
        for(int num=0;num<M;num++){
            i = sc.nextInt();
            j = sc.nextInt();
            int tmp = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = tmp;
        }


        for(int num=0;num<arr.length;num++){
            System.out.println(arr[num]);
        }

    }
}