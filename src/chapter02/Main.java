package chapter02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, m;
        h = sc.nextInt();
        m = sc.nextInt();
        sc.close();

        if(m < 45) {
            h--;
            m = 60 - (45 - m);
            if(h < 0) {
                h = 23;
            }
            System.out.printf("%d %d", h, m);
        } else {
            System.out.printf("%d %d", h, m - 45);
        }
    }
}
