package chapter05.max;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] data = new int[9];
        for(int i = 0 ; i < 9; i++) {
            data[i] = sc.nextInt();
        }

        int max = 0;
        int index = 0;

        for(int i = 0; i < 9 ; i++) {
            if(data[i] > max) {
                max = data[i];
                index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
