class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++){
            String s = Character.toString(my_string.charAt(i)); 
                
            if(answer.contains(s)){
                continue;
            }
            
            answer += my_string.charAt(i);
        }
        return answer;
    }
}