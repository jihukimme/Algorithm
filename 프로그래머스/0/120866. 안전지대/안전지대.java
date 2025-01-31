class Solution {
    public int solution(int[][] board) {
        int answer = 0;
                
        int n = board.length;
        int[][] arr = new int[n][n];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] == 1){
                    for(int ni=i-1; ni<=i+1; ni++){
                        for(int nj=j-1; nj<=j+1; nj++){
                            if(ni>=0 && ni<n && nj>=0 && nj<n){
                                arr[ni][nj] = 1;
                            }
                        }
                    }
                }
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] == 0){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}