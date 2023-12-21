package baekjun.silver.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class bj2108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int median = 0;
        int mode = 0;

        //중앙값 찾기위한 배열 따로분리
        int[] arr2 = new int[num];

        //-4000~4000
        int[] arr = new int[8001];

        //최대 , 최솟값 구하기
        for (int i = 0; i < num; i++) {
            int val = scanner.nextInt();

            sum += val;
            arr2[i] = val;
            arr[val+4000]++;

            if(max < val){
                max = val;
            }
            if(min > val){
                min = val;
            }
        }

        //중앙값 구하기
        Arrays.sort(arr2);
        median = arr2[num/2];

        //최빈값 구하기
        int mode_max = 0;
        boolean flag = false;

        for (int i = min + 4000; i <= max + 4000; i++) {
            if(arr[i] > 0){
                if(mode_max < arr[i]){
                    mode_max = arr[i];
                    mode = i-4000;
                    flag = true;
                }
                else if(flag == true && mode_max == arr[i]){
                    mode = i-4000;
                    flag = false;
                }
            }
        }




        //산술평균
        System.out.println((int)Math.round((double)sum/num));
        //중앙값
        System.out.println(median);
        //최빈값
        System.out.println(mode);
        //범위
        System.out.println(max-min);
    }
}
//산술평균 : N개의 수들의 합을 N으로 나눈 값
//        중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
//        최빈값 : N개의 수들 중 가장 많이 나타나는 값
//        범위 : N개의 수들 중 최댓값과 최솟값의 차이
