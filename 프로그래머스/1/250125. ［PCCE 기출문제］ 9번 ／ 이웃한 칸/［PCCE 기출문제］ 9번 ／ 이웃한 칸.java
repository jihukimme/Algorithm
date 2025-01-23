import java.lang.*;

class Solution {
    public int solution(String[][] board, int h, int w) {
        // 고른 칸과 이웃한 칸들(위, 아래, 왼쪽, 오른쪽) 중 같은 색 칸의 개수 return
        
        int n = board.length;
        
        int count = 0;
        
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};
        
        int h_check = 0;
        int w_check = 0;
        
        for(int i=0; i<4; i++){
            h_check = h + dh[i];
            w_check = w + dw[i];
            
            if((0<=h_check && h_check<n) && (0<=w_check && w_check<n)){
                if(board[h][w].equals(board[h_check][w_check]))
                    count ++;
            }
        }
            
        
        return count;
    }
}