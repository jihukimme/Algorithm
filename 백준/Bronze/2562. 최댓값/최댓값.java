import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[9];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<9; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] sortArr = arr.clone();
        Arrays.sort(sortArr);

        int index = 0;
        for(int i=0; i<9; i++){
            if(arr[i] == sortArr[8]){
                index = i;
            }
        }

        StringBuilder sb = new StringBuilder();

        sb.append(sortArr[8]).append("\n").append(index+1);

        System.out.println(sb);
    }
}
