import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int test_case = 1; test_case <= T; test_case++) {
            String s = br.readLine();

            String strYear = s.substring(0, 4);
            String strMonth = s.substring(4, 6);
            String strDay = s.substring(6);

            String dateFormat = "";

            sb.append("#").append(test_case).append(" ");

            if(!isAvailabelDate(strMonth, strDay)) {
                sb.append(-1).append("\n");
            }
            else{
                dateFormat = strYear + "/" + strMonth + "/" + strDay;
                sb.append(dateFormat).append("\n");
            }
        }

        System.out.println(sb);
    }

    public static boolean isAvailabelDate(String strMonth, String strDay) {
        int month = Integer.parseInt(strMonth);
        int day = Integer.parseInt(strDay);

        if(month < 1 || month > 12){
            return false;
        }
        else {
            if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                if(day < 1 || day > 31){
                    return false;
                }
            }
            else if(month == 2){
                if(day < 1 || day > 28){
                    return false;
                }
            }
            else if(month == 4 || month == 6 || month == 9 || month == 11){
                if(day < 1 || day > 30){
                    return false;
                }
            }
        }

        return true;
    }
}