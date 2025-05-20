import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = Integer.parseInt(br.readLine());

            String numberStr = br.readLine();

            String[] strArr = numberStr.split(" ");

            int maxFrequencyScore = getMaxFrequencyScore(strArr);

            sb.append("#").append(n).append(" ").append(maxFrequencyScore).append("\n");
        }

        System.out.println(sb);
    }

    static int getMaxFrequencyScore(String[] strArr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(String s : strArr) {
            int score = Integer.parseInt(s);

            map.put(score, map.getOrDefault(score, 0) + 1);
        }

        int maxFreq = 0;

        for(int freq : map.values()) {
            if(freq > maxFreq) {
                maxFreq = freq;
            }
        }

        int maxScore = 0;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int score = entry.getKey();
            int freq = entry.getValue();

            if(freq == maxFreq && score > maxScore) {
                maxScore = score;
            }
        }

        return maxScore;
    }
}