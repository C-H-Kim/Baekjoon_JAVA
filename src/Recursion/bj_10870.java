package Recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bj_10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int num) {
        if(num <= 1) {
            return num;
        }

        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
