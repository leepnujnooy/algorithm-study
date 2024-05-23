package baekjun.bronze.etc;

import java.util.Scanner;

public class bj2675 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < testCase; i++) {
            String[] tmp = scanner.nextLine().split(" ");
            int repeatNum = Integer.parseInt(tmp[0]);
            String tempString = "";
            for (int j = 0; j < tmp[1].length(); j++) {
                tempString += String.valueOf(tmp[1].charAt(j)).repeat(repeatNum);
            }
            System.out.println(tempString);
        }
    }
}
