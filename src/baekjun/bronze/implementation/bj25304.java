package baekjun.bronze.implementation;

import java.util.Scanner;

public class bj25304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = Integer.parseInt(scanner.nextLine());
        int num = Integer.parseInt(scanner.nextLine());
        int test = 0;

        for (int i = 0; i < num; i++) {
            int[] a = new int[2];
            String[] strings = scanner.nextLine().split(" ");
            for (int j = 0; j < 2; j++) {
                a[j] = Integer.parseInt(strings[j]);
            }
            test += a[0]*a[1];
        }

        if(sum == test){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }


    }
}
