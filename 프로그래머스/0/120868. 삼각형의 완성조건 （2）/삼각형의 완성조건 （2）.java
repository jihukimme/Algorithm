class Solution {
    public int solution(int[] sides) {
        int answer = 0;
                
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        
        // max가 x보다 클 때, x가 max보다 클 때
        // max<x+min;
        // x<max+min; 
        // max-min<x<max+min;
        
        for(int i=max-min+1; i<max+min; i++){
            answer++;
        }
                
        return answer;
    }
}