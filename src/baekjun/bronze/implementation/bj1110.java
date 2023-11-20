package baekjun.bronze.implementation;

import java.util.Scanner;

public class bj1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = scanner.nextInt();
        int tempNum = firstNum;

        for (int i = 1; i != 0; i++) {
            tempNum = (10 * (tempNum % 10)) + ((tempNum/10) + (tempNum % 10)) % 10;
            if(firstNum == tempNum){
                System.out.println(i);
                break;
            }
        }
    }
}
