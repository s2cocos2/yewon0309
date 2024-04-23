import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        int[] arr = new int[7];
        arr[a]++;
        arr[b]++;
        arr[c]++;
        arr[d]++;

        int one = 0, two = 0, three = 0, four = 0, max = 0;
        for(int i=1;i<=6;i++){
            if(arr[i] == 1) one = i;
            if(arr[i] == 2) two = i;
            if(arr[i] == 3) three = i;
            if(arr[i] == 4) four = i;
        }


        if(four > 0){
            answer = 1111 * four;
        } else if(three > 0){
            answer = (10 * three + one) * (10 * three + one);
        } else if(two > 0){
            for(int i=1;i<=6;i++){
                if(one + two + three + four == two){
                    int two2 = 0;
                    for(int j=1;j<=6;j++){
                        if(arr[j] == 2 && two != j){
                            two2 = j;
                        }
                    }
                    answer = (two + two2) * Math.abs(two - two2);
                } else {
                    int num1 = 0, num2 = 0;
                    for(int j=1;j<=6;j++){
                        if(arr[j] == 1){
                            num1 = j;
                            break;
                        }
                    }
                    for(int j=1;j<=6;j++){
                        if(arr[j] == 1 && j != num1){
                            num2 = j;
                            break;
                        }
                    }

                    answer = num1 * num2;
                }

            }
       } else {
            List<Integer> list = new ArrayList<>();
            list.add(a);
            list.add(b);
            list.add(c);
            list.add(d);
            int min = Collections.min(list);

            answer = min;
        }

        return answer;
    }
}