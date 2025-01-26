class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0; i<quiz.length; i++){
            String[] arr = quiz[i].split(" ");
            
            int left = Integer.parseInt(arr[0]);
            int right = Integer.parseInt(arr[2]);
            int result = Integer.parseInt(arr[4]);
            
            if(arr[1].equals("+")){
                if(left+right == result){
                    answer[i] = "O";
                }
                else{
                    answer[i] = "X";
                }
            }
            else if(arr[1].equals("-")){
                if(left-right == result){
                    answer[i] = "O";
                }
                else{
                    answer[i] = "X";
                }
            }
        }        
        
        
        
        return answer;
    }
}