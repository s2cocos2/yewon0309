import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        for(int num=0;num<N;num++){
            arr[num] = 0;
        }

        int i = 0;
        int j = 0;
        int k = 0;
        for(int num=0;num<M;num++){
            i = sc.nextInt();
            j = sc.nextInt();
            k = sc.nextInt();
            for(int num2=i-1;num2<=j-1;num2++){
                arr[num2] = k;
            }
        }


        for(int num=0;num<arr.length;num++){
            System.out.println(arr[num]);
        }

    }
}