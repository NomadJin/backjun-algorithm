package chapter05.restCount;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] data = new int[10];
        int[] result = new int[10];
        int count = 1;

        for (int i = 0; i < 10; i++) {
            data[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            result[i] = data[i] % 42;
        }

        Arrays.sort(result);

        for (int i = 1; i < result.length; i++) {
            if(result[i-1] != result[i]) {
                count++;
            }
        }

        System.out.println(count);

    }
}
