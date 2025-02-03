class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int size = brown + yellow;
        
        int row = 0;
        int col = 0;
        
//         size == row*col;
                
        
        while(size != row*col){
            row++;
            for(col = 1; col<row; col++){
                if(size == row*col && yellow == (row-2) * (col-2)){
                    break;
                }
            }            
        }
        
        
        answer[0] = row;
        answer[1] = col;
        
        return answer;
    }
}