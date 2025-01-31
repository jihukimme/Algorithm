import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] arr = my_string.replaceAll("[a-zA-Z]", " ").split(" ");
        
        System.out.println(Arrays.toString(arr));
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].isEmpty()){
                continue;
            }
            answer += Integer.parseInt(arr[i]);
        }
        
        return answer;
    }
}