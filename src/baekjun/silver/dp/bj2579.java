package baekjun.silver.dp;

import java.util.Scanner;

public class bj2579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        //인덱스 헷갈리지 않기 위해 +1
        int[] score = new int[N+1];
        int[] stair = new int[N+1];

        //계단 값
        for (int i = 1; i <=N ; i++) {
            stair[i] = sc.nextInt();
        }

        //시작점이므로 최대값 == 시작점값
        score[1] = stair[1];

        //계단이 두개 == 계단 한개씩 오르는게 최댓값
        score[2] = stair[1] + stair[2];

        score[3] = Math.max(stair[1], stair[2]) + stair[3];

        for (int i = 4; i <= N; i++) {
            //dp[i-2] == 두 계단 한번에 밟아 도착점
            //dp[i-3] + arr[i-1] == 두 계단 + 한 계단 밟아 도착점
            //마지막 arr[i] 는 도착점의 점수를 추가한 것
            score[i] = Math.max(score[i-2],score[i-3] + stair[i-1]) + stair[i];
        }

        System.out.println(score[N]);
    }
}