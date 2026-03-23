// import java.util.*;

// class Solution {
    
//     HashSet<Integer> set = new HashSet<>();
//     boolean[] isVisited;
    
//     public int solution(String numbers) {
//         isVisited = new boolean[numbers.length()];
        
//         dfs(0, numbers, "");
        
//         int count = 0;
//         for(int number : set){
//             if(isPrime(number)){
//                 count++;
//             }
//         }
        
//         return count;
//     }
    
//     public void dfs(int depth, String numbers, String s){
//         if(depth > numbers.length()){
//             return;
//         }
        
//         for(int i=0; i<numbers.length(); i++){
//             if(!isVisited[i]){
//                 isVisited[i] = true;
//                 set.add(Integer.parseInt(s + numbers.charAt(i)));
//                 dfs(depth+1, numbers, s + numbers.charAt(i));
//                 isVisited[i] = false;
//             }
//         }
//     }
    
//     public boolean isPrime(int number){
//         if(number < 2)
//             return false;
        
//         for(int i=2; i<number; i++){
//             if(number%i==0){
//                 return false;
//             }
//         }
       
//         return true;
//     }
    
// }


import java.util.*;

class Solution {
    
    HashSet<Integer> set = new HashSet<>();
    boolean[] isVisited;
    
    public int solution(String numbers) {
        isVisited = new boolean[numbers.length()];
        
        dfs(0, numbers, "");
        
        int count = 0;
        
        for(int n:set){
            if(isPrime(n)){
                count++;
            }
        }
        
        return count;
    }
    
    public void dfs(int depth, String numbers, String s){
        if(depth == numbers.length()){
            return;
        }
        
        for(int i=0; i<numbers.length(); i++){
            if(!isVisited[i]){
                isVisited[i]=true;
                set.add(Integer.parseInt(s+numbers.charAt(i)));
                dfs(depth+1, numbers, s+numbers.charAt(i));
                isVisited[i]=false;
            }
        }
    }
    
    public boolean isPrime(int number) {
        if(number<2){
            return false;
        }
        else{
            for(int i=2;i<number;i++){
                if(number%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}