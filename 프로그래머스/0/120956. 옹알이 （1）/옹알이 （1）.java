
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] s = {"aya", "ye", "woo", "ma"};
        
        for(int i=0; i<babbling.length; i++){            
            for(int j=0; j<s.length; j++){
                if(babbling[i].contains(s[j])){
                    babbling[i] = babbling[i].replace(s[j], "!");
                }
            }
            
            babbling[i] = babbling[i].replace("!", "");
        }
        
        for(int i=0; i<babbling.length; i++){
            if(babbling[i].length() == 0){
                answer++;
            }
        }
        
        return answer;
    }
    
    
}