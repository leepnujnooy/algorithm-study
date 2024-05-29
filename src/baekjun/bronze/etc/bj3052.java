package baekjun.bronze.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class bj3052 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            int temp = arr[i] % 42;
            set.add(temp);
        }
        System.out.println(set.size());

    }
}
