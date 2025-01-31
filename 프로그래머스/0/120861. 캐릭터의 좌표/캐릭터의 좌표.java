import java.util.*;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        
        
        int row = board[0];
        int col = board[1];
        
        int[] position = {0, 0};
        
        int n = keyinput.length;
        
        
        for(int i=0; i<n; i++){
            if(keyinput[i].equals("left") && position[0]>-(row-1)/2){
                position[0]--;
            }
            else if(keyinput[i].equals("right") && position[0]<(row-1)/2){
                position[0]++;
            }
            else if(keyinput[i].equals("up") && position[1]<(col-1)/2){
                position[1]++;
            }
            else if(keyinput[i].equals("down") && position[1]>-(col-1)/2){
                position[1]--;
            }
            else{
                continue;
            }
        }
        
        return position;
    }
}