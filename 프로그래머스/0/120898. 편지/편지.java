class Solution {
    public int solution(String message) {
        int answer = 0;
        
        // 한글자 = 2cm
        // message 길이 * 2
        
        answer = message.length() * 2;
        
        return answer;
    }
}