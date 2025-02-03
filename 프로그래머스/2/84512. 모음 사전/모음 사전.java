import java.util.*;

class Solution {
    
    ArrayList<String> list;
    // boolean[] visited;
    
    public int solution(String word) {
        
        String[] aeiou = {"A", "E", "I", "O", "U"};
        list = new ArrayList<>();
        
        // int n = aeiou.length;
        // visited = new boolean[n];
        
        dfs(0, aeiou, "");
        
        int count = 0;
        for(String s : list){
            if(s.equals(word)){
                System.out.println(s);
                return count+1;
            }
            else{
                count++;
            }
        }
        
        return 0;
    }
    
    
    public void dfs(int depth, String[] aeiou, String s){
        if(depth>=aeiou.length){
            return;
        }
        
        for(int i=0; i<aeiou.length; i++){
            // if(!visited[i]){
            //     visited[i] = true;
            //     list.add(s+aeiou[i]);
            //     dfs(depth+1, aeiou, s+aeiou[i]);
            //     visited[i] = false;
            // }
            
            list.add(s+aeiou[i]);
            dfs(depth+1, aeiou, s+aeiou[i]);
        }
        
    }
    
    
}