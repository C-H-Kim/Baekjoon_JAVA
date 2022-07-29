package Function;

import java.io.*;

public class bj_4673 {
    public static int d(int number) {
        int sum = number;

        while(number != 0) {
            sum += (number %10);
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] check = new boolean[10001];

        for(int i = 0; i < 10001; i++) {
            int n = d(i);

            if(n < 10001)
                check[n] = true;
        }

        for(int i = 0; i < 10001; i++) {
            if(!check[i])
                bw.write(i + "\n");
        }
        bw.close();
    }
}
