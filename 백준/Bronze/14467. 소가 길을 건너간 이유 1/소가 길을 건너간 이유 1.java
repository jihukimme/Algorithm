import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {
            arr[i] = -1;
        }

        int count = 0;

        for (int i = 1; i < n+1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int cow = Integer.parseInt(st.nextToken());
            int position = Integer.parseInt(st.nextToken());

            if (arr[cow] == -1) {
                arr[cow] = position;
            } else if(arr[cow] != position){
                count++;
                arr[cow] = position;
            }
        }

        System.out.println(count);

    }
}
