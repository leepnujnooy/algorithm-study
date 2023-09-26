package baekjun.silver.bruteforce;

import java.util.Scanner;

public class bj1065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int answer = 0;
        for (int i = 1; i <= num; i++) {
            if(function(i)) answer++;
        }
        System.out.println(answer);
    }


    public static boolean function(int number){
        if(number < 100){
            return true;
        }
        else if(number > 100 && number < 1000){
            String[] chk = String.valueOf(number).split("");
            if(Integer.parseInt(chk[2]) - Integer.parseInt(chk[1]) == Integer.parseInt(chk[1]) - Integer.parseInt(chk[0])){
                return true;
            }
        }


        return false;
    }
}
