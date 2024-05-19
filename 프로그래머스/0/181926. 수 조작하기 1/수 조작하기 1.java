class Solution {
    public int solution(int n, String control) {
        Direction d = new Direction();
        long wCount = control.chars().filter(c -> c == 'w').count();
        long sCount = control.chars().filter(c -> c == 's').count();
        long dCount = control.chars().filter(c -> c == 'd').count();
        long aCount = control.chars().filter(c -> c == 'a').count();
        for(int i =0; i <= wCount; i++){
            n = d.wDirection(n);
        }
        for(int i =0; i <= sCount; i++){
            n = d.sDirection(n);
        }
        for(int i =0; i <= dCount; i++){
            n = d.dDirection(n);
        }
        for(int i =0; i <= aCount; i++){
            n = d.aDirection(n);
        }
        return n;
    }
}

class Direction{
    public int wDirection(int n){
        return n+1;
    }
    public int sDirection(int n){
        return n-1;
    }
    public int dDirection(int n){
        return n+ 10;
    }
    public int aDirection(int n){
        return n-10;
    }
}