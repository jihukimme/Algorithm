// import java.util.*;

// class Solution {
    
//     ArrayList<Integer> countList;
//     boolean[] visited;
    
//     public int solution(int k, int[][] dungeons) {
        
//         countList = new ArrayList<>();
//         visited = new boolean[dungeons.length];
        
//         dfs(0, visited, k, dungeons, 0);
        
//         countList.sort(Collections.reverseOrder());
        
//         int maxCount = countList.get(0);
        
//         return maxCount;
//     }
    
//     public void dfs(int depth, boolean[] visited, int k, int[][] dungeons, int count){
//         if(depth>=dungeons.length){
//             countList.add(count);
//             return;
//         }
        
//         for(int i=0; i<dungeons.length; i++){
//             if(!visited[i] && dungeons[i][0]<=k){
//                 visited[i] = true;
            
//                 dfs(depth+1, visited, k-dungeons[i][1], dungeons, count+1);
//                 visited[i] = false;
//             }
//         }
//     }
    
// }

import java.util.*;

class Solution {
    
    ArrayList<Integer> list = new ArrayList<>();
    boolean[] isVisited;
    
    public int solution(int k, int[][] dungeons) {
        isVisited = new boolean[dungeons.length];
        
        dfs(0, k, dungeons, 0);
        
        int max = 0;
        for(int n : list){
            if(max<n) {
                max = n;
            }
        }
       
        return max;
    }
    
    void dfs(int depth, int k, int[][] dungeons, int count){
        if(depth>dungeons.length) {
            // list.add(count+1);
            return;
        }
        
        for(int i=0; i<dungeons.length; i++){
            if(!isVisited[i] && dungeons[i][0] <= k){
                isVisited[i] = true;
                if(k-dungeons[i][1] >= 0){
                    // k-=dungeons[i][1];
                    list.add(count+1);
                    dfs(depth+1, k-dungeons[i][1], dungeons, count+1);
                }
                isVisited[i] = false;
            }
        }
    }
    
    
}