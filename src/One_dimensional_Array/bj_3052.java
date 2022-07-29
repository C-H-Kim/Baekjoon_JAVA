package One_dimensional_Array;

import java.io.*;

public class bj_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[42];
        int cnt = 0;

        for(int i = 0; i < 10; i++)
            arr[Integer.parseInt(br.readLine()) % 42] = true;

        for(boolean val : arr) {
            if(val)
                cnt++;
        }

        System.out.println(cnt);
    }
}
