import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            if(a==1){
                arr[l-1] = r;
            }
            else if(a==2){
                for(int j=l-1; j<r; j++){
                    if(arr[j]==0){
                        arr[j]=1;
                    }
                    else{
                        arr[j]=0;
                    }
                }
            }
            else if(a==3){
                for(int j=l-1; j<r; j++){
                    arr[j]=0;
                }
            }
            else{
                for(int j=l-1; j<r; j++){
                    arr[j]=1;
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<n; i++){
            sb.append(arr[i]).append(" ");
        }


        System.out.println(sb);
    }
}
