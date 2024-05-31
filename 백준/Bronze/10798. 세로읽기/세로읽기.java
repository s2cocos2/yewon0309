import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[5];

        int maxLength = 0;
        for(int i=0;i<str.length;i++){
            str[i] = sc.nextLine();
            maxLength = Math.max(maxLength, str[i].length());
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<maxLength;i++){
            for(int j=0;j<str.length;j++){
                if(i < str[j].length()){
                    sb.append(str[j].charAt(i));
                }
            }
        }

        System.out.println(sb.toString());

        }
}