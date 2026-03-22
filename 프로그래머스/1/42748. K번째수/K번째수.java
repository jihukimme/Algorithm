import java.util.*;


class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length];
        
        for(int x=0; x<commands.length; x++){
            int i=commands[x][0];
            int j=commands[x][1];
            int k=commands[x][2];
            
            int[] arr = new int[j-i+1];
            
            int idx = 0;
            for(int n=i-1; n<j; n++){
                arr[idx]=array[n];
                idx++;
            }
            
            Arrays.sort(arr);
            
            answer[x] = arr[k-1];
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