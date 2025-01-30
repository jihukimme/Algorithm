import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        
        int answer = 0;
        int[] arr = new int[201]; 
        
        for(int i=0; i<lines.length; i++){
            int start = lines[i][0] + 100; //0~200으로 구간 설정 (-100~100)
            int end = lines[i][1] + 100;
            
            for(int j=start; j<end; j++){
                arr[j]+=1;
            }
        }
        
        for(int i=0; i<=200; i++){
            if(arr[i] >= 2){
                answer++;
            }
        }
  
        return answer;
    }
}