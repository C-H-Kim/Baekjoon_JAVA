package Sorting;

import java.io.*;

public class bj_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        int[] arr = new int[N.length()];

        for(int i = 0; i < N.length(); i++) {
            arr[i] = N.charAt(i) - 48;
        }

        insertion_Sort(arr);

        for(int k : arr) {
            System.out.print(k);
        }
    }

    public static void insertion_Sort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
