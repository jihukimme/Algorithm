import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        
        ArrayList<Integer> list = new ArrayList<>();
        int[] days = new int[progresses.length];
        
        
        for(int i=0; i<progresses.length; i++){
            days[i] = (100 - progresses[i]) / speeds[i];
            if((100 - progresses[i]) % speeds[i]>0){
                days[i]++;
            }
        }
        
        int x = days[0];
        int count = 1;
        
        for(int i=1; i<progresses.length; i++){
            if(x>=days[i]){
                count++;
            }
            else{
                list.add(count);
                x = days[i];
                count = 1;
            }
        }
        
        list.add(count);
        
        answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}