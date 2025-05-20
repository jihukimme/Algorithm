import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            String s =  br.readLine();
            sb.append(minInsertPalindrom(s)).append("\n");
        }

        System.out.println(sb);
    }

    static int minInsertPalindrom(String s) {
        int left = 0;
        int right = s.length()-1;
        int count = 0;

        while(left<right) {
            char l = s.charAt(left);
            char r = s.charAt(right);

            if(l==r) {
                left++;
                right--;
            }
            else if(l=='x'){
                left++;
                count++;
            }
            else if(r=='x'){
                right--;
                count++;
            }
            else {
                return -1;
            }
        }

        return count;
    }
}