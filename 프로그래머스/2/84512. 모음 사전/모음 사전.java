// import java.util.*;

// class Solution {
    
//     char[] charArr = {'A', 'E', 'I', 'O', 'U'};
//     ArrayList<String> list = new ArrayList<>();
    
//     public int solution(String word) {
//         dfs(0, "");
        
//         int count = 0;
//         for(String s : list){
//             count++;
            
//             if(s.equals(word)){
//                 return count;
//             }
//         }
        
//         return count; 
//     }
    
    
//     public void dfs(int depth, String s){
//         if(depth==charArr.length) {
//             return;
//         }
        
//         for(int i=0; i<charArr.length; i++){
//             list.add(s+charArr[i]);
//             dfs(depth+1, s+charArr[i]);
//         }
//     }
// }


import java.util.*;

class Solution {
    
    char[] charArr = {'A', 'E', 'I', 'O', 'U'};
    ArrayList<String> list = new ArrayList<>();
    
    public int solution(String word) {
        dfs(0, "");
        
        for(int i=0; i<list.size(); i++){
            if(list.get(i).equals(word)){
                return i+1;
            }
        }
        
        return 0;
    }
    
    public void dfs(int depth, String s){
        if(depth >= charArr.length){
            return;
        }
        
        for(int i=0; i<charArr.length; i++){
            list.add(s+charArr[i]);
            dfs(depth+1, s+charArr[i]);
        }
    }
    
}