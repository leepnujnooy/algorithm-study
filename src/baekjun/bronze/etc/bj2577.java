package baekjun.bronze.etc;

import java.util.Scanner;

public class bj2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        String sum = String.valueOf(num1*num2*num3);
        
        int[] arr = new int[10];
        for (int i = 0; i < sum.length(); i++) {
            arr[Integer.parseInt(String.valueOf(sum.charAt(i)))]++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
