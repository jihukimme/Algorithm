import java.util.*;

class Solution {
    
    ArrayList<Integer> countList;
    boolean[] visited;
    
    public int solution(int k, int[][] dungeons) {

        int n = dungeons.length;
        
        countList = new ArrayList<>();
        visited = new boolean[n];
        
        dfs(0, k, dungeons, 0);
        
        int maxCount = 0;
        for(int count : countList){
            if(maxCount<count){
                maxCount = count;
            }
        }
        
        return maxCount;
    }
    
    public void dfs(int depth, int k, int[][] dungeons, int count){
        if(depth>=dungeons.length){
            return;
        }
        
        for(int i=0; i<dungeons.length; i++){
            if(!visited[i] && k>=dungeons[i][0]){
                visited[i] = true;
                // k-=dungeons[i][1];
                // count++;
                countList.add(count+1);
                dfs(depth+1, k-dungeons[i][1], dungeons, count+1);
                visited[i] = false;
            }
            // System.out.println(countList);
        }
    }
    
}