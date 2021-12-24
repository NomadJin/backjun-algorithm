package chapter05.minMax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

//        Scanner sc = new Scanner(System.in);
//        StringBuilder sb = new StringBuilder();
//
//        int tc = sc.nextInt();
//        int[] data = new int[tc];
//        for(int i = 0 ; i < tc ; i++) {
//            data[i] = sc.nextInt();
//        }
//        sc.close();
//        Arrays.sort(data);
//        sb.append(data[0]).append(" ").append(data[tc-1]);
//        System.out.println(sb);

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int max = -Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;

        while(st.hasMoreTokens()) {
            int val = Integer.parseInt(st.nextToken());
            if(val > max) max = val;
            if(val < min) min = val;
        }
        System.out.println(min + " " + max);
    }
}
