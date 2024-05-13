import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] str = sc.nextLine().split("");

        int answer = 0;
        for(int i=0;i<str.length;i++){
            if(str[i].equals("A") || str[i].equals("B") || str[i].equals("C")){
                answer += 3;
            } else if(str[i].equals("D") || str[i].equals("E") || str[i].equals("F")){
                answer += 4;
            } else if(str[i].equals("G") || str[i].equals("H") || str[i].equals("I")){
                answer += 5;
            } else if(str[i].equals("J") || str[i].equals("K") || str[i].equals("L")){
                answer += 6;
            } else if(str[i].equals("M") || str[i].equals("N") || str[i].equals("O")){
                answer += 7;
            } else if(str[i].equals("P") || str[i].equals("Q") || str[i].equals("R") || str[i].equals("S")){
                answer += 8;
            } else if(str[i].equals("T") || str[i].equals("U") || str[i].equals("V")){
                answer += 9;
            } else if(str[i].equals("W") || str[i].equals("X") || str[i].equals("Y") || str[i].equals("Z")){
                answer += 10;
            } else {
                answer += 11;
            }
        }

        System.out.println(answer);

    }
}