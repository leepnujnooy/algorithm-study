package baekjun.silver.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class bj1929 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        boolean[] isPrime = new boolean[num2+1];
        isPrime[0] = false;
        isPrime[1] = false;
        Arrays.fill(isPrime,true);

        for (int i = 2; i*i <= num2; i++) {
            if(isPrime[i]){
                for (int j = i*i; j <= num2; j+=i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = num1; i <= num2; i++) {
            if(isPrime[i]){
                sb.append(String.valueOf(i) + "\n");
            }
        }

        System.out.println(sb);
    }
}
