package Basic_Math2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class bj_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());
        int sum = 0;
        ArrayList list = new ArrayList();

        for(int i = start; i <= end; i++) {
            boolean isPrime = true;

            if(i == 1) {
                continue;
            }

            for(int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                sum += i;
                list.add(i);
            }
        }

        if(sum == 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
            System.out.println(Collections.min(list));
        }
    }
}
