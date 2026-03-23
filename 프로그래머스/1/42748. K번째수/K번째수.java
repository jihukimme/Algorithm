import java.util.*;


class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length];
        
        for(int n=0; n<commands.length; n++){
            int i = commands[n][0];
            int j = commands[n][1];
            int k = commands[n][2];
            
            int size = j-i+1;
            
            int[] arr = new int[size];
            int idx = 0;
            
            for(int m=i-1; m<=j-1; m++){
                arr[idx] = array[m];
                idx++;
            }
            
            Arrays.sort(arr);
            answer[n] = arr[k-1];
        }
        
        return answer;
        
        
//         int[] answer = new int[commands.length];
        
//         for(int i=0; i<commands.length; i++){
            
//             int size = commands[i][1] - commands[i][0] + 1;
            
            
//             int[] arr = new int[size];
//             int idx = 0;
            
//             for(int j=commands[i][0] -1; j<= commands[i][1]-1; j++) {
//                 arr[idx] = array[j];
//                 idx++;
//             }
            
//             Arrays.sort(arr);
            
//             answer[i] = arr[commands[i][2]-1];
         
//         }
        
//         return answer;
    }
}