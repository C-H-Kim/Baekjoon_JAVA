package Conditional_Statement;

import java.util.Scanner;

public class bj_2525 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cur_hour, cur_min;
        int runtime;

        cur_hour = sc.nextInt();
        cur_min = sc.nextInt();
        runtime = sc.nextInt();

        cur_hour += runtime / 60;
        cur_min += runtime % 60;
        if(cur_min >= 60) {
            cur_hour += 1;
            cur_min -= 60;
        }

        if(cur_hour > 23)
            cur_hour -= 24;

        System.out.println(cur_hour + " " + cur_min);
    }
}
