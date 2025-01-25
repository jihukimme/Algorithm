import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String[] chars = my_string.toLowerCase().split("");
        
        Arrays.sort(chars, Collections.reverseOrder());
        
        for(int i=chars.length-1; i>=0; i--){
            answer += chars[i];
        }
        
        return answer;
    }
}