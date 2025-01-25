class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int sum = (num * (num-1))/2; //0부터n까지 합
        int start = (total - sum)/num;
        
        for(int i=0; i<answer.length; i++){
            answer[i] = i+start;
        }
        
        
        return answer;
    }
}