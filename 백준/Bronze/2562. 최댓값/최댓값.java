import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<9;i++){
            int num = sc.nextInt();
            arr[i] = num;
            list.add(num);
        }

        int max = Collections.max(list);
        System.out.println(max);

        int n = list.indexOf(max);
        System.out.println(n + 1);
    }
}