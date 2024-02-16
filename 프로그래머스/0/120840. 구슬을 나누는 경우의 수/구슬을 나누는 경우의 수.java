class Solution {
    public int solution(int balls, int share) {
        if(balls == share || share == 0){
            return 1;
        } else {
            return solution(balls-1, share) + solution(balls-1, share-1);
        }
    }
}