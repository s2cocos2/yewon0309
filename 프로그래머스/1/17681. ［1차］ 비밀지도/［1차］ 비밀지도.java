import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        String[] arr11 = new String[arr1.length];
        String[] arr22 = new String[arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr11[i] = Integer.toBinaryString(arr1[i]);
            arr22[i] = Integer.toBinaryString(arr2[i]);
        }

        for(int i=0;i<arr11.length;i++){
            while (arr11[i].length() < n){
                arr11[i] = "0" + arr11[i];
            }

            while (arr22[i].length() < n){
                arr22[i] = "0" + arr22[i];
            }
        }

        for(int i=0;i<arr11.length;i++){
            if(arr11[i].equals("1") || arr22[i].equals("1")){
                answer[i] = "#";
            } else if(arr11[i].equals("0") && arr22[i].equals("0")){
                answer[i] = " ";
            }
        }

        for(int i=0;i<arr11.length;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<arr11[i].length();j++){
                String str1 = String.valueOf(arr11[i].charAt(j));
                String str2 = String.valueOf(arr22[i].charAt(j));
                if(str1.equals("1") || str2.equals("1")){
                    sb.append("#");
                } else if(str1.equals("0") && str2.equals("0")){
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}