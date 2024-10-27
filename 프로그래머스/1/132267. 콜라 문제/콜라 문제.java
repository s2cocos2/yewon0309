public class Solution {
    public int solution(int a, int b, int n) {
        int totalCola = 0;
        while (n >= a) {
            int newCola = (n / a) * b;
            totalCola += newCola;
            
            n = (n % a) + newCola;
        }

        return totalCola;
    }
}
