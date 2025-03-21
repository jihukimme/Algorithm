import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[9][9];

        for(int i=0; i<9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for(int j=0; j<9; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int col = 0;
        int row = 0;
        int max = 0;

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(max<arr[i][j]){
                    max = arr[i][j];
                    col = i;
                    row = j;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        sb.append(max).append("\n").append(col+1).append(" ").append(row+1);

        System.out.println(sb);
    }
}
