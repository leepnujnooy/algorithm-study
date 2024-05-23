package baekjun.bronze.etc;

import java.util.Scanner;

public class bj2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int si = scanner.nextInt();
        int bun = scanner.nextInt();

        bun = bun-45;

        if(bun < 0){
            if(si == 0){
                si = 23;
                bun = 60 + bun;
            }
            else{
                si = si - 1;
                bun = 60 + bun;
            }
        }

        System.out.println(si + " " + bun);

    }
}
