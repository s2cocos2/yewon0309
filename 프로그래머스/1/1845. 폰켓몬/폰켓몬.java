import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int count = nums.length / 2;
        if(count < set.size()){
            answer = count;
        } else {
            answer = set.size();
        }
        return answer;
    }
}