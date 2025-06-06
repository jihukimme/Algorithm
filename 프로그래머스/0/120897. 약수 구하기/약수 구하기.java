import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer;
        ArrayList<Integer> list = new ArrayList<>();
        
        // 정수 n의 약수를 오름차순으로 return
        
        for(int i=1; i<=n; i++){
            if(n%i==0){
                list.add(i);
            }
        }
        
        answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}