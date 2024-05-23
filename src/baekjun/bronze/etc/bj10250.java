package baekjun.bronze.etc;

import java.util.Scanner;

public class bj10250 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        for (int i = 0; i < testCase; i++) {
            int height = scanner.nextInt(); //6
            int width = scanner.nextInt(); //12
            int number = scanner.nextInt(); //10
            int count = 0;
            String tmpH = "";
            String tmpW = "";

            for (int j = 1; j <= width; j++) {
                for (int k = 1; k <= height; k++) {
                    count++;
                    if(count == number) {
                        tmpH = String.valueOf(k);
                        tmpW = String.valueOf(j);
                        break;
                    }
                }
            }

            if(tmpW.length() < 2) tmpW = "0"+tmpW;

            System.out.println(tmpH+tmpW);

        }
    }
}
