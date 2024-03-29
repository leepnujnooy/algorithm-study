package baekjun.bronze.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class bj2309 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] nan = new int[9];

        int sum = 0;

        int tempi = 0;
        int tempj = 0;

        for (int i = 0; i < 9; i++) {
            nan[i] = Integer.parseInt(br.readLine());
            sum+=nan[i];
        }

        for (int i = 0; i < nan.length; i++) {
            for (int j = i+1; j < nan.length; j++) {
                if(sum - (nan[i]+nan[j])== 100){
                    int cnt = 0;
                    for (int k = 0; k < nan.length; k++) {
                        if(k != i && k != j){
                            cnt++;
                        }
                    }
                    if(cnt == 7){
                        tempi = i;
                        tempj = j;
                        break;
                    }

                }
            }
        }

        nan[tempi] =0;
        nan[tempj] =0;

        Arrays.sort(nan);

        for (int i = 0; i < nan.length; i++) {
            if(nan[i] != 0){
                System.out.println(nan[i]);
            }
        }




    }
}
//    왕비를 피해 일곱 난쟁이들과 함께 평화롭게 생활하고 있던 백설공주에게 위기가 찾아왔다. 일과를 마치고 돌아온 난쟁이가 일곱 명이 아닌 아홉 명이었던 것이다.
//
//        아홉 명의 난쟁이는 모두 자신이 "백설 공주와 일곱 난쟁이"의 주인공이라고 주장했다. 뛰어난 수학적 직관력을 가지고 있던 백설공주는, 다행스럽게도 일곱 난쟁이의 키의 합이 100이 됨을 기억해 냈다.
//
//        아홉 난쟁이의 키가 주어졌을 때, 백설공주를 도와 일곱 난쟁이를 찾는 프로그램을 작성하시오.
//
//        20
//        7
//        23
//        19
//        10
//        15
//        25
//        8
//        13

//---

//        7
//        8
//        10
//        13
//        19
//        20
//        23