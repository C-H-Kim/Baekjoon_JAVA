package Conditional_Statement;

import java.util.Scanner;

public class bj_2480 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a == b && c == a)
            System.out.println(10000 + a * 1000);
        else if(a == b || c == a)
            System.out.println(1000 + a * 100);
        else if(b == c)
            System.out.println(1000 + b * 100);
        else
            System.out.println(Math.max(a, Math.max(b, c)) * 100);
    }
}
