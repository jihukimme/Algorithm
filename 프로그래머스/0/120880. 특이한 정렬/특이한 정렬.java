import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Arrays.sort(numlist);
        
        int[] answer = new int[numlist.length];
        int[] minus = new int[numlist.length];
        boolean[] visited = new boolean[numlist.length];
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<numlist.length; i++){
            map.put(i, Math.abs(numlist[i]-n));
            minus[i] = Math.abs(numlist[i]-n);
        }
        
        Arrays.sort(minus);
        
        for(int i=0; i<numlist.length; i++){
            for(int j=numlist.length-1; j>=0; j--){
                if(minus[i] == map.get(j) && !visited[j]){
                    answer[i] = numlist[j];
                    visited[j] = true;
                    break;
                }
            }                
        }
        
        return answer;
    }
}