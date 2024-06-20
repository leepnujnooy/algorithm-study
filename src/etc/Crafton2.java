package etc;

import java.util.Arrays;
import java.util.Scanner;

public class Crafton2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String R = scanner.nextLine();
        int[] V = new int[R.length()];
        for (int i = 0; i < V.length; i++) {
            V[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(solution(R,V)));
    }

    public static int[] solution(String R, int[] V){


        int a = 0;
        int minimumA = 0;
        int b = 0;
        int minimumB = 0;

        for (int i = 0; i < R.length(); i++) {

            int money = V[i];

            //B->A 송금시
            if(R.charAt(i) == 'A'){
                a += money;
                b -= money;

                if(b < 0){
                    minimumB += -b;
                    b = 0;
                }
            }
            //A->B 송금시
            else{
                a -= money;
                b += money;

                if(a < 0){
                    minimumA += -a;
                    a = 0;
                }
            }
        }

        return new int[]{minimumA,minimumB};
    }
}
