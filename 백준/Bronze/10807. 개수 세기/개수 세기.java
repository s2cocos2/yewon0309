import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            int num = sc.nextInt();
            arr[i] = num;
        }

        int target = sc.nextInt();

        int answer = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                answer++;
            }
        }

        System.out.println(answer);

    }
}