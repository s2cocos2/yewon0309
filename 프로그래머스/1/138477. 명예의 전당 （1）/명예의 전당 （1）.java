import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i=0;i<score.length;i++){
            if(q.size() < k){
                q.add(score[i]);
            } else if(q.peek() < score[i]){
                q.poll();
                q.add(score[i]);
            }
            answer[i] = q.peek();
        }
        return answer;
    }
}