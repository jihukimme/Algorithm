class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] arr = s.split(" ");
        int n = arr.length;
        
        for(int i=0; i<n; i++){
            if(arr[i].equals("Z")){
                if(i>0){
                    answer -= Integer.parseInt(arr[i-1]);
                }
            }
            else{
                answer += Integer.parseInt(arr[i]);
            }
        }
        
        
        return answer;
    }
}