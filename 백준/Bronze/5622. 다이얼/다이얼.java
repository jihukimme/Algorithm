import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] dial = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

        String s = br.readLine();
        String[] arr = s.split("");

        int time = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<dial.length; j++){
                if(dial[j].contains(arr[i])){
                    time+=3+j;
                }
            }
        }

        System.out.println(time);
    }
}
