import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        
        Double[] arr = new Double[score.length]; 
        
        for(int i=0; i<score.length; i++){
            arr[i] = ((double)score[i][0] + (double)score[i][1])/2;
        }
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        for(int i=0; i<score.length; i++){
            double average = ((double)score[i][0] + (double)score[i][1])/2;
            
            for(int j=0; j<score.length; j++){
                if(average == arr[j]){
                    answer[i] = j + 1;
                    break;
                }
            }
        }
        
        return answer;
    }
}