class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        int row = box[0];
        int col = box[1];
        int height = box[2];
        
        int rowCount = row/n;
        int colCount = col/n;
        int heightCount = height/n;
        
        answer = rowCount * colCount * heightCount;
        
        return answer;
    }
}