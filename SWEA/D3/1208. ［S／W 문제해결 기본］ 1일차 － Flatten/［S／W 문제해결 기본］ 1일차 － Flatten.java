import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = 10;

        StringBuilder sb = new StringBuilder();

        for (int test_case = 1; test_case <= T; test_case++) {
            int dumpCount = Integer.parseInt(br.readLine());
            String str = br.readLine();
            String[] strArr = str.split(" ");

            int[] arr = new int[strArr.length];

            for(int i=0;i<strArr.length;i++){
                arr[i] = Integer.parseInt(strArr[i]);
            }

            int value = dump(arr, dumpCount);

            sb.append("#").append(test_case).append(" ").append(value).append("\n");
        }

        System.out.println(sb);
    }

    public static int dump(int[] arr, int dumpCount) {
        while(dumpCount > 0){
            Arrays.sort(arr);

            int maxHeigh = arr[arr.length-1];
            int minHeigh = arr[0];

            arr[0] = minHeigh+1;
            arr[arr.length-1] = maxHeigh-1;

            dumpCount--;
        }

        Arrays.sort(arr);

        return arr[arr.length-1] - arr[0];
    }
}