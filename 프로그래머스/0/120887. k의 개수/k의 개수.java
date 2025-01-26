class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        String s = "";
        for(int n=i; n<=j; n++){
            s += Integer.toString(n);
        }
        
        String[] arr = s.split("");
        for(int m=0; m<arr.length; m++){
            if(arr[m].equals(Integer.toString(k))){
                answer++;
            }
        }
        
        return answer;
    }
}