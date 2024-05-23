package baekjun.bronze.etc;

import java.util.Scanner;

public class bj2562 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int idx = 0;
        for (int i = 1; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 1; i < 10; i++) {
            if(arr[i] >= max) max = arr[i];
        }

        for (int i = 0; i < 10 ; i++) {
            if(arr[i] == max) idx = i;
        }
        System.out.println(max);
        System.out.println(idx);



    }
}
