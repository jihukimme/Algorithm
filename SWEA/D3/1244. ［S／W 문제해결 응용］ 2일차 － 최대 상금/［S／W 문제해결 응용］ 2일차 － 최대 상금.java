import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

class Solution {

    static HashSet<String> set = new HashSet<>();

    static int max;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int test_case = 1; test_case <= T; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            String numberStr = st.nextToken();
            int swapCount = Integer.parseInt(st.nextToken());

            max = 0;
            dfs(numberStr, swapCount, 0);

            sb.append("#").append(test_case).append(" ").append(max).append("\n");

            //list.clear();
            set.clear();
        }

        System.out.println(sb);
    }

    public static void dfs(String numberStr, int swapCount, int depth){
        if(depth == swapCount){
            max = Math.max(max, Integer.parseInt(numberStr));
            return;
        }

        String setItem = numberStr + depth;

        if(set.contains(setItem)){
            return;
        }
        set.add(setItem);

        for(int i=0; i<numberStr.length()-1; i++){
            int index1 = i;
            for(int j=i+1; j<numberStr.length(); j++){
                int index2 = j;
                String newNumberStr = swap(numberStr, index1, index2);
                dfs(newNumberStr, swapCount, depth+1);
            }
        }
    }

    public static String swap(String numberStr, int index1, int index2){
        StringBuilder sb = new StringBuilder(numberStr);

        sb.setCharAt(index1, numberStr.charAt(index2));
        sb.setCharAt(index2, numberStr.charAt(index1));

        return sb.toString();
    }
}