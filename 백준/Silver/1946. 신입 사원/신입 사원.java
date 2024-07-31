import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());


        for(int i=0;i<T;i++){
            int N = Integer.parseInt(br.readLine());
            int[][] applicant = new int[N][2];
            for(int j=0;j<N;j++){
                String[] str = br.readLine().split(" ");
                applicant[j][0] = Integer.parseInt(str[0]); // 지원자의 서류심사 성적
                applicant[j][1] = Integer.parseInt(str[1]); // 지원자의 면접 성적
            }

            // 서류심사 성적을 기준으로 오름차순 정렬
            Arrays.sort(applicant, Comparator.comparingInt(a -> a[0]));

            // 서류심사 1등은 무조건 합격함으로 1로 초기화
            int count = 1;
            int score = applicant[0][1]; // 서류심사 1등의 면접 성적으로 초기화
            for(int j=1;j<N;j++){
//              1. 서류심사 1등의 면접 성적보다 순위가 높으면 합격
//              2. 그 다음 score는 이 전 지원자의 면접 성적으로 저장
                if(applicant[j][1] < score){
                    count++;
                    score = applicant[j][1];

                }
            }

            System.out.println(count);






        }



    }
}