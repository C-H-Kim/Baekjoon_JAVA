package One_dimensional_Array;

import java.io.*;

public class bj_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        int[] arr = new int[10];

        while(val != 0) {
            arr[val % 10]++;
            val = val / 10;
        }

        for(int res : arr)
            System.out.println(res);
    }
}
