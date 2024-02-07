class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int num = 0;
        String op = "+";

        String[] str = my_string.split(" ");
        for(int i=0;i<str.length;i++){
            if(str[i].matches("^[0-9]*$")){
                num = Integer.parseInt(str[i]);
                if(op.equals("+")){
                    answer += num;
                } else {
                    answer -= num;
                }
            }

            if(str[i].equals("+") || str[i].equals("-")){
                op = str[i];
            }
        }
        return answer;
    }
}