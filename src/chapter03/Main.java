package chapter03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        InputNumbers[] inputs = new InputNumbers[tc];
        for(int i = 0 ; i < tc; i++) {
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            InputNumbers inputNumbers = new InputNumbers(a, b);
            inputs[i] = inputNumbers;
        }

        for(int i = 0 ; i < tc ; i++) {
            testCase(inputs[i]);
        }
    }

    public static void testCase(InputNumbers inputs) {
        System.out.println(inputs.getA() + inputs.getB());
    }
}

class InputNumbers {
    private int a;
    private int b;

    public InputNumbers(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
