package baekjun.silver.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class bj11399 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int person = scanner.nextInt();
        int[] seconds = new int[person];
        int wholeTime = 0;

        for (int i = 0; i < person; i++) {
            seconds[i] = scanner.nextInt();
        }

        Arrays.sort(seconds);

        for (int i = 0; i < person; i++) {
            int temp  = 0;
            for (int j = 0; j <= i; j++) {
                temp += seconds[j];
            }
            wholeTime += temp;
        }

        System.out.println(wholeTime);

    }
}