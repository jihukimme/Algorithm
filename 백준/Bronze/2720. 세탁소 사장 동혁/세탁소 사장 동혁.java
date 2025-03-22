import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int n = Integer.parseInt(s);

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            int d = Integer.parseInt(br.readLine());

            int quarter = 0;
            int dime = 0;
            int nickel = 0;
            int penny = 0;

            quarter = d/25;
            d %= 25;

            dime = d/10;
            d %= 10;

            nickel =d/5;
            d %= 5;

            penny = d/1;
            d %= 1;

            sb.append(quarter).append(" ").append(dime).append(" ").append(nickel).append(" ").append(penny).append("\n");
        }

        System.out.println(sb);
    }
}
