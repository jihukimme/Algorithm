import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        // 우선순위 높을수록(숫자 클수록), 같은 우선순위라면 최근에 꺼낸 프로세스 실행
        
        int answer = 0;
        
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i : priorities){
            priorityQueue.add(i);
        }
        
        while(!priorityQueue.isEmpty()){
            for(int i=0; i<priorities.length; i++){
                if(priorityQueue.peek() == priorities[i]){
                    priorityQueue.poll();
                    answer++;
                    
                    if(location == i){
                        return answer;
                    }
                }
            }
        }
        
        
        return answer;
    }
}