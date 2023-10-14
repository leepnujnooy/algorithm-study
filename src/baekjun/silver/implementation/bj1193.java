package baekjun.silver.implementation;


import java.util.Scanner;

public class bj1193 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();


        int bunZa = 0;
        int bunMo = 0;

        int count = 1;
        int minus = 1;
        //true = 윗방향 , false = 아랫방향
        boolean direction = true;

        while(true){
            if(num - minus <= 0){
                break;
            }
            num -= minus;
            minus++;
            count++;
            if(direction) direction = false;
            else if(!direction) direction = true;
        }
//
//        System.out.println(num);
//        System.out.println(count);
//        System.out.println(direction);


        //윗방향
        if(direction){
            bunZa = count;
            bunMo = 1;
            if(num != 1){
                for (int i = 1; i < num; i++) {
                    bunZa--;
                    bunMo++;
                }
            }
        }
        //아랫방향
        else{
            bunZa = 1;
            bunMo = count;
            if (num != 1) {
                for (int i = 1; i < num; i++) {
                    bunZa++;
                    bunMo--;
                }
            }
        }

        System.out.println(bunZa+"/"+bunMo);

    }
}
//    이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
//
//        X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.