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
        
        int max = Collections.max(list);
        
        double sum = 0;
        for(int i=0;i<list.size();i++){
            sum += (double)list.get(i) / max * 100;
        }
        
        double answer = sum / list.size();
        System.out.println(answer);
    }
}