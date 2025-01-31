import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer;
        
        String[] arr = my_string.replaceAll("[a-zA-Z]", "").split("");
        
        int n= arr.length;
        answer = new int[n];
        
        for(int i=0; i<n; i++){
            answer[i] += Integer.parseInt(arr[i]);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}