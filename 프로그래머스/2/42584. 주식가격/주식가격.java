class Solution {
    public int[] solution(int[] prices) {
        int[] arr = new int[prices.length];
        
        int time = 0;
        
        for(int i=0; i<prices.length; i++){
            
            
            for(int j=i+1; j<prices.length; j++){
                time++;
                
                if(prices[i]>prices[j]){
                    break;
                }    
            }
            
            arr[i]=time;
            time=0;
        }
        
        return arr;
        
        
        
//         int[] answer = new int[prices.length];
        
        
//         for(int i=0; i<prices.length; i++){
        
//             for(int j=i+1; j<prices.length; j++){
//                 answer[i]++;
                
//                 if(prices[i]>prices[j]){
//                     break;
//                 }
//             }
            
//         }
        
        
//         return answer;
    }
}