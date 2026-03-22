class Solution {
    public int[] solution(int brown, int yellow) {
        
        int row = 0;
        int col = 0;
        
        int size = brown + yellow;
        
        while(size != row*col){
            row++;
            for(col=1; col<row; col++){
                if(row*col == size && (row-2)*(col-2) == yellow){
                    break;
                }
            }
        }
        
        int[] arr = {row, col};
        
        return arr;
        
        
//         int[] answer = new int[2];
        
//         int size = brown + yellow;
        
//         int row = 0; // 가로
//         int col = 0; // 세로
        
//         while(row * col != size){
//             row++;
//             for(col=1; col<row; col++){
//                 if(col*row==size && yellow==(col-2)*(row-2)){
//                     break;
//                 }
//             }
//         }
        
//         answer[0] = row;
//         answer[1] = col;
        
//         return answer;
    }
}