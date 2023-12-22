package baekjun.bronze.implementation;

import java.util.Scanner;

public class bj2444 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1; i <= (num*2)-1; i++) {
            if(i <= num){
                    System.out.printf("%s%s\n"," ".repeat(num-i),"*".repeat((i*2)-1));

            }
            else{
                for (int j = num-1; j >=1 ; j--) {
                    if(j == (num*2)-1){
                        System.out.printf("%s%s"," ".repeat(num-j),"*".repeat(j*2-1));
                    }
                    else{
                        System.out.printf("%s%s\n"," ".repeat(num-j),"*".repeat(j*2-1));
                    }

                }
                break;
            }
        }

    }
}
