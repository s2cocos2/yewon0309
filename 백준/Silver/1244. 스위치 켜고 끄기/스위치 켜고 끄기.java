import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] switchStat = new int[N];
        String[] str = br.readLine().split(" ");
        for(int i=0;i<N;i++){
            switchStat[i] = Integer.parseInt(str[i]);
        }

        int studentNum = Integer.parseInt(br.readLine());

        for(int i=0;i<studentNum;i++){
            String[] student = br.readLine().split(" ");
            int gender = Integer.parseInt(student[0]);
            int number = Integer.parseInt(student[1]);

            //남학생일 경우
            if(gender == 1){
                for(int j=number-1;j<N;j+=number){
                    if(switchStat[j] == 0){
                        switchStat[j] = 1;
                    } else {
                        switchStat[j] = 0;
                    }
                }
            } else {
                //여학생일 경우
                int left = number-1;
                int right = number-1;
                while(left >= 0 && right < N && switchStat[left] == switchStat[right]){
                    left--;
                    right++;
                }
                left++;
                right--;

                for(int j=left;j<=right;j++){
                    if(switchStat[j] == 1){
                        switchStat[j] = 0;
                    } else {
                        switchStat[j] = 1;
                    }
                }


            }
        }

        for(int i=0;i<N;i++){
            System.out.print(switchStat[i] + " ");
            if((i+1) % 20 == 0){
                System.out.println();
            }
        }


    }
}
//