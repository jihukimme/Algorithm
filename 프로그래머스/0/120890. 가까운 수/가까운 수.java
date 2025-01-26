class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int min = Math.abs(n-array[0]);
        
        for(int i=1; i<array.length; i++){
            if(min>Math.abs(n-array[i]) || min == Math.abs(n-array[i]) && array[i]<answer){
                min = Math.abs(n-array[i]);
                answer = array[i];
            }
        }
        
        return answer;
    }
}