package baekjun.bronze.etc;

import java.util.Scanner;

public class bj11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();
        String num = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        }

        System.out.println(sum);
    }
}
