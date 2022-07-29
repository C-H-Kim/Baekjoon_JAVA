package One_dimensional_Array;

import java.io.*;

public class bj_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int test_case = Integer.parseInt(br.readLine());
        int sum, cnt;
        String str;

        for(int i = 0; i < test_case; i++) {
            sum = 0;
            cnt = 0;

            str = br.readLine();
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == 'O') {
                    cnt++;
                    sum += cnt;
                }
                else {
                    cnt = 0;
                }
            }
            bw.write(sum + "\n");
        }
        bw.close();
    }
}
