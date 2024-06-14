import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<N;i++){
            int num = sc.nextInt();
            list.add(num);
        }

        Collections.sort(list);

        for(int i=0;i<list.size();i++){
            int num = list.get(i);
            System.out.println(num);
        }





        }
}