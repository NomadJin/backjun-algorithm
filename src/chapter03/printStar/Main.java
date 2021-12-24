package chapter03.printStar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder star = new StringBuilder();
        for(int i = 0 ; i < n ; i++) {
            int spaceCount = n - i - 1;
            star.append("*");
            String result = " ".repeat(Math.max(0, spaceCount)) + star;
            System.out.println(result);
        }
    }
}
