import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int money = Integer.parseInt(br.readLine());

        int[] prices = new int[14];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<14; i++){
            prices[i] = Integer.parseInt(st.nextToken());
        }

        int bnpAccount = getBnpAccount(money, prices);
        int timingAccount = getTimingAccount(money, prices);

        if(bnpAccount>timingAccount) {
            System.out.println("BNP");
        }
        else if(bnpAccount<timingAccount) {
            System.out.println("TIMING");
        }
        else{
            System.out.println("SAMESAME");
        }
    }

    public static int getBnpAccount(int money, int[] prices){
        int n=0;

        for(int i=0; i<prices.length; i++){
            if(money>=prices[i]){
                n+=money/prices[i];
                money=money%prices[i];
            }
        }

        return money+n*prices[prices.length-1];
    }

    public static int getTimingAccount(int money, int[] prices){
        int n=0;

        for(int i=3; i<prices.length; i++){
            if(prices[i-3]<prices[i-2] && prices[i-2]<prices[i-1] && prices[i-1]<prices[i]){
                if(n>0){
                    money+=n*prices[i];
                    n=0;
                }
            }
            else if(prices[i-3]>prices[i-2] && prices[i-2]>prices[i-1] && prices[i-1]>prices[i]){
                if(money>=prices[i]){
                    n+=money/prices[i];
                    money=money%prices[i];
                }
            }
        }

        return money+n*prices[prices.length-1];
    }

}
