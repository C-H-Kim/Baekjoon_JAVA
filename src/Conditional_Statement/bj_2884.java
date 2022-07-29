package Conditional_Statement;

import java.util.Scanner;

public class bj_2884 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour, minute;

        hour = sc.nextInt();
        minute = sc.nextInt();

        if(minute - 45 < 0) {
            hour = hour - 1;
            minute = minute + 15;
        }
        else
            minute = minute - 45;

        if(hour < 0)
            hour = 23;

        System.out.println(hour + " " + minute);
    }
}
