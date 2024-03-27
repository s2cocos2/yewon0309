class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] str = polynomial.split(" ");
        
        int numX = 0;
        int num = 0;
        for(int i=0;i<str.length;i++){
            if(!str[i].equals("+") && str[i].contains("x")){
                String s = str[i].substring(0, str[i].length()-1);
                if(s.length() == 0){
                    s = "1";
                }
                int sNum = Integer.parseInt(s);
                numX += sNum;
            } else if(!str[i].equals("+")) {
                int sNum = Integer.parseInt(str[i]);
                num += sNum;
            }
        }

        String X = String.valueOf(numX);
        String N = String.valueOf(num);

        if(X.equals("0") && N.equals("0")){
            answer = "0";
        } else if(X.equals("1") && !N.equals("0")){
            answer = "x + " + N;
        } else if(X.equals("1") && N.equals("0")){
            answer = "x";
        } else if(X.equals("0")){
            answer = N;
        } else if(N.equals("0")){
            answer = X + "x";
        } else {
            answer = X + "x + " + N;
        }

        return answer;
    }
}