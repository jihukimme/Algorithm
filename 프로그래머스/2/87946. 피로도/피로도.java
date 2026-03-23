import java.util.*;

class Solution {
    
    ArrayList<Integer> list = new ArrayList<>();
    boolean[] isVisited;
    
    public int solution(int k, int[][] dungeons) {
        isVisited = new boolean[dungeons.length];
        
        dfs(0, k, dungeons);
        
        Collections.sort(list, Collections.reverseOrder());
        
        return list.get(0);
    }    
    
    public void dfs(int depth, int k, int[][] dungeons){
        if(depth>dungeons.length){
            return;
        }
        
        for(int i=0; i<dungeons.length; i++){
            if(!isVisited[i] && k>=dungeons[i][0]){
                isVisited[i] = true;
                list.add(depth+1);
                dfs(depth+1, k-dungeons[i][1], dungeons);
                isVisited[i] = false;
            }
        }
    }
    
}

// import java.util.*;

// class Solution {
    
//     ArrayList<Integer> list = new ArrayList<>();
//     boolean[] isVisited;
    
//     public int solution(int k, int[][] dungeons) {
//         isVisited = new boolean[dungeons.length];
        
//         dfs(0, k, dungeons, 0);
        
//         int max = 0;
//         for(int n : list){
//             if(max<n) {
//                 max = n;
//             }
//         }
       
//         return max;
//     }
    
//     void dfs(int depth, int k, int[][] dungeons, int count){
//         if(depth>=dungeons.length) {
//             return;
//         }
        
//         for(int i=0; i<dungeons.length; i++){
//             if(!isVisited[i] && dungeons[i][0] <= k){
//                 isVisited[i] = true;
//                 if(k-dungeons[i][1] >= 0){
//                     // k-=dungeons[i][1];
//                     list.add(count+1);
//                     dfs(depth+1, k-dungeons[i][1], dungeons, count+1);
//                 }
//                 isVisited[i] = false;
//             }
//         }
//     }
    
    
// }