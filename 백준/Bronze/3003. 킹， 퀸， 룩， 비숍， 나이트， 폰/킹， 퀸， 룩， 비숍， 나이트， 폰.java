
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int[] arr = {1, 1, 2, 2, 2, 8};

        String[] sArr = br.readLine().split(" ");
        
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<arr.length; i++){
            sb.append(arr[i] - Integer.parseInt(sArr[i])).append(" ");
        }

        System.out.println(sb);
    }
}