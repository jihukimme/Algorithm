import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int n = score.length;
        
        int[] answer = new int[n];
        Double[] arr = new Double[n];
        
        for(int i=0; i<n; i++){
            arr[i] = ((double)score[i][0] + (double)score[i][1])/2;
        }
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        HashMap<Double, Integer> map = new HashMap<>();
        
        int rank = 1;
        for(int i=0; i<n; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], rank);
            }
            rank++;
        }
        
        for(int i=0; i<n; i++){
            double avg = ((double)score[i][0] + (double)score[i][1])/2;
            
            answer[i] = map.get(avg);
        }
        
        return answer;
    }
}