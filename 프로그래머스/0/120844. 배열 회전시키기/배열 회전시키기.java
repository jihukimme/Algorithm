class Solution {
    public int[] solution(int[] numbers, String direction) {
        int n = numbers.length;
        int[] answer = new int[n];
        
        if(direction.equals("right")){
            for(int i=0; i<n; i++){
                if(i+1>=n){
                    answer[0] = numbers[i];
                }
                else{
                    answer[i+1] = numbers[i];
                }
            }
        }
        
        if(direction.equals("left")){
            for(int i=n-1; i>=0; i--){
                if(i-1<0){
                    answer[n-1] = numbers[i];
                }
                else{
                    answer[i-1] = numbers[i];
                }
            }
        }
        
        
        return answer;
    }
}