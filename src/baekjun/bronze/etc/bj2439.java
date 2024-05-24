package baekjun.bronze.etc;

import java.util.Scanner;

public class bj2439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            String temp = "";
            temp += " ".repeat(num-i-1) + "*".repeat(i+1);
            System.out.println(temp);
        }


    }
}
