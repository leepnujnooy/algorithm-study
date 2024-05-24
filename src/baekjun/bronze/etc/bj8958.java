package baekjun.bronze.etc;

import java.util.Scanner;

public class bj8958 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        scanner.nextLine();

        String[] testCaseList = new String[testCase];
        for (int i = 0; i < testCase; i++) {
            testCaseList[i] = scanner.nextLine();
        }

        for (int i = 0; i < testCase; i++) {
            int score = 0;
            int plus = 1;
            for (int j = 0; j < testCaseList[i].length(); j++) {
                if(testCaseList[i].charAt(j) == 'O'){
                    score += plus;
                    plus++;
                }
                else if(testCaseList[i].charAt(j)== 'X'){
                    plus = 1;
                }
            }
            System.out.println(score);
        }
    }
}
