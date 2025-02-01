class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        
        int result = Integer.parseInt(bin1,2) + Integer.parseInt(bin2, 2);
        
        answer = Integer.toString(result, 2);
        
        System.out.println(result);
        System.out.println(Integer.toString(result, 2));
        
        return answer;
    }
}