import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] score = new String[20][3];

        for(int i=0; i<20; i++){
            String s = br.readLine();

            score[i] =  s.split(" ");
        }

        double totalS = 0;
        double totalH = 0;

        for(int i=0; i<20; i++){
            if(score[i][2].equals("P")) {
                continue;
            }

            totalH += Double.parseDouble(score[i][1]);

            if(score[i][2].equals("A+")){
                totalS += Double.parseDouble(score[i][1]) * 4.5;
            } else if (score[i][2].equals("A0")) {
                totalS += Double.parseDouble(score[i][1]) * 4.0;
            } else if (score[i][2].equals("B+")) {
                totalS += Double.parseDouble(score[i][1]) * 3.5;
            } else if (score[i][2].equals("B0")) {
                totalS += Double.parseDouble(score[i][1]) * 3.0;
            } else if (score[i][2].equals("C+")) {
                totalS += Double.parseDouble(score[i][1]) * 2.5;
            } else if (score[i][2].equals("C0")) {
                totalS += Double.parseDouble(score[i][1]) * 2.0;
            } else if (score[i][2].equals("D+")) {
                totalS += Double.parseDouble(score[i][1]) * 1.5;
            } else if (score[i][2].equals("D0")) {
                totalS += Double.parseDouble(score[i][1]) * 1.0;
            } else {
                totalS += 0;
            }
        }

        double result = totalS/totalH;

        System.out.println(result);
    }
}
