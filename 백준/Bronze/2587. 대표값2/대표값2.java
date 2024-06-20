import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            int num = sc.nextInt();
            list.add(num);
        }

        Collections.sort(list);

        int sum = 0;
        for(int i=0;i<list.size();i++){
            sum += list.get(i);
        }

        System.out.println(sum / 5);
        System.out.println(list.get(2));






        }
}