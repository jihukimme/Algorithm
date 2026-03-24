import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[9];
        int sum = 0;
        
        for(int i=0; i<9; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum+=arr[i];
        }
        
        Arrays.sort(arr);
        
        int fake1 = -1;
        int fake2 = -1;
        
        for(int i=0; i<9-1; i++){
            for(int j=i+1; j<9; j++){
                if(sum - arr[i] - arr[j] == 100){
                    fake1 = i;
                    fake2 = j;
                }
            }
        }
        
        for(int i=0; i<9; i++){
            if(i==fake1 || i==fake2){
                continue;
            }
            System.out.println(arr[i]);
        }
    }
}
