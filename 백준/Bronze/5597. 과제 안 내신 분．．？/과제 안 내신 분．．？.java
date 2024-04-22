import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr1 = new int[30];
        for(int i=0;i<arr1.length;i++){
            arr1[i] = i+1;
        }

        List<Integer> list1 = new ArrayList<>();
        for(int i=0;i<28;i++){
            int N = sc.nextInt();
            list1.add(N);
        }

        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            if(!list1.contains(arr1[i])){
                list2.add(arr1[i]);
            }
        }

        Collections.sort(list2);
        
        for(int i=0;i<list2.size();i++){
            System.out.println(list2.get(i));
        }
    }
}