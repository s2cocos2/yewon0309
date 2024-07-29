import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] height = new int[9];
        int length = height.length;
        int sum = 0;
        for(int i=0;i<length;i++){
            height[i] = sc.nextInt();
            sum += height[i];
        }

        int fake1 = -1;
        int fake2 = -1;

        Arrays.sort(height);

        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(sum - (height[i] + height[j]) == 100){
                    fake1 = i;
                    fake2 = j;
                    break;
                }
            }
        }

        for(int i=0;i<length;i++){
            if(i != fake1 && i != fake2){
                System.out.println(height[i]);
            }
        }

    }
}
