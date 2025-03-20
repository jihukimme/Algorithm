import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        String[] arr = s.split(" ");

        int num1 = Integer.parseInt(new StringBuilder().append(arr[0]).reverse().toString());
        int num2 = Integer.parseInt(new StringBuilder().append(arr[1]).reverse().toString());
        
        System.out.println(num1>num2 ? num1 : num2);
    }
}