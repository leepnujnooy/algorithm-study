package baekjun.silver.etc;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class bj18110 {
    public static void main(String[] args) throws IOException {
        //초기 설정
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         int allNum= Integer.parseInt(br.readLine());
//        int allNum = sc.nextInt();
        int[] arr = new int[allNum];
        for (int i = 0; i < allNum; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        //의견이 0개 일 경우
        if(allNum == 0){
            System.out.println(0);
        }
        //의견이 1개 일 경우
        else if(allNum == 1){
            System.out.println(arr[0]);
        }
        //의견이 2개 일 경우
        else if(allNum == 2){
            System.out.println(Math.round(((float) arr[0] + arr[1])/2));
            System.out.println(0);
        }
        //의견이 3개 일 경우
        else if(allNum == 3){
            System.out.println(arr[1]);
        }
        //그 이상일 경우
        else{
            int julSak = (int) Math.round(allNum * 0.15);
            int temp = 0;
            int num = allNum - 2*julSak;
            //4 2 /  0 1 2 3
            for (int i = julSak; i < allNum-julSak; i++) {
                // 0 1 / 2 3 4 5 6 7 / 8 9
//                System.out.println(arr[i]);
                temp += arr[i];
            }

            float a = (float) temp / num ;
            System.out.println(Math.round(a));
        }
    }
}
//아직 아무 의견이 없다면 문제의 난이도는 0으로 결정한다.
//의견이 하나 이상 있다면, 문제의 난이도는 모든 사람의 난이도 의견의 30% 절사평균으로 결정한다.
//절사평균이란 극단적인 값들이 평균을 왜곡하는 것을 막기 위해 가장 큰 값들과 가장 작은 값들을 제외하고 평균을 내는 것을 말한다.
// 30% 절사평균의 경우 위에서 15%, 아래에서 15%를 각각 제외하고 평균을 계산한다. 따라서 20명이 투표했다면,
// 가장 높은 난이도에 투표한 3명과 가장 낮은 난이도에 투표한 3명의 투표는 평균 계산에 반영하지 않는다는 것이다.
//
//제외되는 사람의 수는 위, 아래에서 각각 반올림한다. 25명이 투표한 경우 위, 아래에서 각각 3.75명을 제외해야 하는데, 이 경우 반올림해 4명씩을 제외한다.
//
//마지막으로, 계산된 평균도 정수로 반올림된다. 절사평균이 16.7이었다면 최종 난이도는 17이 된다.