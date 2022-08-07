package Loop_Statement;

import java.io.*;
import java.util.StringTokenizer;

public class bj_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int sum = 0;
        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            sum += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        }

        if(sum == X) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
