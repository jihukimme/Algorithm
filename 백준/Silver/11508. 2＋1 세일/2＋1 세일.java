import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Integer[] prices = new Integer[n];

        for(int i=0; i<n; i++){
            prices[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(prices, Collections.reverseOrder());

        int sum = 0;

        for(int i=0; i<n; i++){
            if((i+1)%3==0){
                continue;
            }
            sum+=prices[i];
        }

        System.out.println(sum);
    }
}
