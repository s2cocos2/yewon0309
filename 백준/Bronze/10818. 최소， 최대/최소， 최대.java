import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];
        for(int i=0;i<N;i++){
            int num = sc.nextInt();
            A[i] = num;
        }

        int max = A[0];
        int min = A[0];
        for(int i=0;i<A.length;i++){
            max = Math.max(A[i], max);;
            min = Math.min(A[i], min);;
        }

        System.out.println(min);
        System.out.println(max);

    }
}