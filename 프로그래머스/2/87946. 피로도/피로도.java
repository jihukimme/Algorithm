import java.util.*;

class Solution {
    
    ArrayList<Integer> countList;
    boolean[] visited;
    
    public int solution(int k, int[][] dungeons) {
        
        countList = new ArrayList<>();
        visited = new boolean[dungeons.length];
        
        dfs(0, visited, k, dungeons, 0);
        
        countList.sort(Collections.reverseOrder());
        
        int maxCount = countList.get(0);
        
        return maxCount;
    }
    
    public void dfs(int depth, boolean[] visited, int k, int[][] dungeons, int count){
        if(depth>=dungeons.length){
            return;
        }
        
        for(int i=0; i<dungeons.length; i++){
            if(!visited[i] && dungeons[i][0]<=k){
                visited[i] = true;
                countList.add(count+1);
                dfs(depth+1, visited, k-dungeons[i][1], dungeons, count+1);
                visited[i] = false;
            }
        }
    }
    
}