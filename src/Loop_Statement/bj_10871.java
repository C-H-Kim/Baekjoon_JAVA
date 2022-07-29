package Loop_Statement;

import java.io.*;
import java.util.StringTokenizer;

public class bj_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int iter, max;

        StringTokenizer st = new StringTokenizer(br.readLine());

        iter = Integer.parseInt(st.nextToken());
        max = Integer.parseInt(st.nextToken());

        int[] arr = new int[iter];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        for(int num : arr) {
            if(num < max)
                bw.write(num + " ");
        }
        bw.write("\n");
        bw.close();
    }
}
