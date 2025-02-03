import java.util.*;

class Solution {
    
    HashSet<Integer> set = new HashSet<>();
    boolean[] visited = new boolean[7];
    
    public int solution(String numbers) {
        
        int answer = 0;
        
        dfs(0, numbers, "");
                
        for(int n : set){
            if(isPrime(n)){
                answer++;
            }
        }
        
        return answer;
    }
    
    
    public void dfs(int depth, String numbers, String s){
        if(depth > numbers.length()){
            return;
        }
        
        for(int i=0; i<numbers.length(); i++){
            if(!visited[i]){
                visited[i] = true;
                set.add(Integer.parseInt(s+numbers.charAt(i)));
                dfs(depth+1, numbers, s+numbers.charAt(i));
                visited[i]=false;
            }

        }
    }
    
    
    public boolean isPrime(int number){
        if(number < 2)
            return false;
        
        for(int i=2; i<number; i++){
            if(number%i==0){
                return false;
            }
        }
       
        return true;
    }
    
}