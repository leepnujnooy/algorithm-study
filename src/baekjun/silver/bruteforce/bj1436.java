package baekjun.silver.bruteforce;

import java.util.Scanner;

public class bj1436 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int cnt = 0;
        int start = 0;

        //666이 들어가는 수
        //1 > 666 , 2 > 1666
        // 1666 , 2666, 3666, 4666, 5666, 6661 , 6662 ... 무한으로 돌리기
        while(true){
            //숫자 시작
            start++;

            //만약 숫자 안에 666이 포함되어있다면 카운트 1
            if(String.valueOf(start).contains("666")){
                cnt++;
            }

            //만약 카운트가 인풋값에 해당되면 엑시트
            if(cnt == num){
                System.out.println(start);
                break;
            }
        }

    }
}
