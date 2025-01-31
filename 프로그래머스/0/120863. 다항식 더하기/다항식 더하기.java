import java.util.*;

class Solution {
    public String solution(String polynomial) {
        
        String[] arr = polynomial.split(" \\+ ");
        
        System.out.println(Arrays.toString(arr));
        
        int resultX = 0;
        int result = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].contains("x")){
                String s = arr[i].replace("x", "");
                resultX += s.equals("") ? 1 : Integer.parseInt(s);
            }
            else{
                result += Integer.parseInt(arr[i]);
            }
        }
        
        if (resultX == 0 && result == 0) return "0";
        if (resultX == 0) return String.valueOf(result);
        if (result == 0) return resultX == 1 ? "x" : resultX + "x";
        return (resultX == 1 ? "x" : resultX + "x") + " + " + result;
    }
}