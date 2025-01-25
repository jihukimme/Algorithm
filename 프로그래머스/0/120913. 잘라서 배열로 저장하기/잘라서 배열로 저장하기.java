import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        ArrayList<String> list = new ArrayList<>();
        
        String[] answer;
        
        for(int i=0; i<my_str.length(); i+=n){
            int e = i+n;

            if(e>my_str.length()){
                e = my_str.length();
            }
            
            list.add(my_str.substring(i,e));
        }
        
        answer = new String[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}