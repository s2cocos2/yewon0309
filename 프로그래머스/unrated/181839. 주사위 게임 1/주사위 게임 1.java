class Solution {
    public int solution(int a, int b) {
        if(a%2!=0) {
            if(b%2!=0)
                return (a*a)+(b*b);
            else
                return 2*(a+b);
        } 
        
        else if (b%2!=0)
            return 2*(a+b);
        
        else
            return a-b < 0 ? (a-b)*-1 : (a-b);
    }
}
//