package String;

import java.io.*;

public class bj_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int roop = Integer.parseInt(br.readLine());
        int sum = 0;
        String str = br.readLine();

        for(int i = 0; i < roop; i++) {
            sum += (int)str.charAt(i) - 48;
        }
        System.out.println(sum);
    }
}
