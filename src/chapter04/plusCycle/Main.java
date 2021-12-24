package chapter04.plusCycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int newNum = n;
        int cycle = 0;

        while(true) {
            int a = newNum % 10;
            int b = ((newNum / 10) + a) % 10;
            newNum = a * 10 + b;
            cycle++;
            if(n == newNum) {
                break;
            }
        }
        System.out.println(cycle);
    }
}
