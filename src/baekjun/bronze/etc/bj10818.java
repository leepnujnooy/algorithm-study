package baekjun.bronze.etc;

import java.util.Arrays;
import java.util.Scanner;

public class bj10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[num-1]);
//
//        int max = 0;
//        int min = 1_000_001;
//
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] >= max) max = arr[i];
//            if(arr[i] <= min) min = arr[i];
//        }
//
//        System.out.println(min + " " + max);
    }
}
