import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=N;i++){
            list.add(i);
        }

        for(int k=0;k<M;k++){
            int i = sc.nextInt();
            int j = sc.nextInt();

            Collections.reverse(list.subList(i-1, j));

        }

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }


    }
}