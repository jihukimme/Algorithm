import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int num = 0;
        int sum = 0;

        String s = br.readLine();

        for(int i=0; i<n; i++){
            num = Integer.parseInt(Character.toString(s.charAt(i)));
            sum += num;
        }

        System.out.println(sum);
    }
}