package baekjun.silver.bruteforce;

public class bj4673 {
    public static void main(String[] args) {

        //1~10000 셀프숫자인지 체크하는
        boolean[] checkSelfNum = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            //모든 자리 숫자 합 + 원래 숫자  = k
            int k = function(i);

            //k 가 10000 이하라면
            if(k < 10001){
                checkSelfNum[k] = true;
            }
        }


        for (int i = 1; i < 10001; i++) {
            if(!checkSelfNum[i]){
                System.out.println(i);
            }
        }

    }

    public static int function(int i){
        int sum = i;
        while(i != 0){
            sum += i%10;
            i /= 10;
        }
        return sum;
    }


}