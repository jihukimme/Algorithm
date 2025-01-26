class Solution {
    public int solution(int num, int k) {
        
        int answer = -1;
        
        String s = Integer.toString(num);
        String[] arr = s.split("");
        
        for(int i=0; i<arr.length; i++){
            if(Integer.parseInt(arr[i]) == k){
                return answer = i+1;
            }
        }
        
        return answer;
    }
}