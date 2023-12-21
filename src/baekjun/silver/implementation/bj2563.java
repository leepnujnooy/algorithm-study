package baekjun.silver.implementation;

import java.util.Scanner;

public class bj2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[][] board = new int[100][100];

        for (int i = 0; i < num; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = x; j < x+10; j++) {
                for (int k = y; k < y+10; k++) {
                    board[j][k]=1;
                    //++ 쓰면 1이상일때 (색종이가 겹칠때) 카운팅을 못해서 1로 정의해놓고 중복시에 1로 계속가게끔 해야함
                }
            }
        }

        int sum = 0;

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(board[i][j] == 1){
                    sum++;
                }
            }
        }

        System.out.println(sum);
    }
}
