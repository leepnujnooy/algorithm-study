package etc;

import java.util.Scanner;

public class Crafton {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        System.out.println(solution(S));
    }

    public static int solution(String S){

        //B A N A N A ==> B:1, A:3, N:2

        int bCount = 0;
        int aCount = 0;
        int nCount = 0;
        int answerCount = 0;

        for (int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == 'B') bCount++;
            else if(S.charAt(i) == 'A') aCount++;
            else if(S.charAt(i) == 'N') nCount++;
        }

        aCount /= 3;
        nCount /= 2;

        // 1 1 2

        if(aCount==0 || bCount==0 || nCount==0){
            return 0;
        }
        else{
            while(true){
                if(bCount <= 0 || aCount <= 0 || nCount <= 0){
                    break;
                }
                bCount--;
                aCount--;
                nCount--;
                answerCount++;
            }
            return answerCount;
        }
    }
}
