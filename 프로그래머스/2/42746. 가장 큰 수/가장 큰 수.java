import java.util.*;
import java.lang.*;

class Solution {
    public String solution(int[] numbers) {
        
        String answer = "";

        String[] numberStr = new String[numbers.length];

        
        for(int i=0; i<numbers.length; i++){
            numberStr[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(numberStr, (s1, s2) -> (s2+s1).compareTo(s1+s2));
        
        
        for(String str:numberStr){
            answer+=str;
        }
        
        if(numberStr[0].equals("0")){
            return "0";
        }
        
        
        return answer;
    }
}