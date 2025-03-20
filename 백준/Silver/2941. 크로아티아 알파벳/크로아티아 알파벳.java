import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        String[] cro = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        
        for(int i=0; i< cro.length; i++){
            if(s.contains(cro[i])){
                s= s.replace(cro[i], ",");
            }
        }

        System.out.println(s.length());
    }
}