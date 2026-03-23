import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int n = Integer.parseInt(br.readLine());

       StringTokenizer st = new StringTokenizer(br.readLine(), " ");

       int count = 0;

       for(int i=0; i<n; i++){
           int number = Integer.parseInt(st.nextToken());
           
           for(int j=2; j<=number; j++){
               if(number==j){
                   count++;
               }
               
               if(number%j==0){
                   break;
               }
           }
       }

        System.out.println(count);
    }
}
