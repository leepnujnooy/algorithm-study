package etc;

import java.util.Arrays;
import java.util.Scanner;

public class GFG {
    public static void main(String[] args) {
//        int[] testCase = {1, 5, 92, 4, 78, 6, 7};
        int[] testCase = {1,2 ,94, 93, 1000,4,5,6, 92, 9999 ,78, 1001, 1002, 1003,1004,1005,10000,10001,10002,10003,10004,10005,10006,10007,10008};
        int[] answer = solution(testCase);
        System.out.printf("%d\n",answer.length);
        System.out.println("The largest set of consecutive elements is");
        for(int i = 0; i < answer.length; i++){
            if(i == answer.length-1){
                System.out.print(answer[i]);
            }else{
                System.out.print(answer[i] + ", ");
            }
        }
    }

    public static int[] solution(int[] arr){
        Arrays.sort(arr);

        int count = 1;
        int maxCount = 1;
        int startNum = -999;
        int finalNum = 0;


        //1 2 78 92 93 94 1000 1001 1002 1003 1004
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1] - arr[i] == 1){
                count++;
                if(startNum == -999) startNum = arr[i];
                if(maxCount < count) {
                    maxCount = count;
                    finalNum = arr[i+1];
                }
            }
            else{
                if(count != 1 || maxCount < count) maxCount = count;
                count = 1;
            }
        }

        int[] answer = new int[maxCount];
        for (int i = maxCount-1; i >= 0; i--) {
            answer[i] = finalNum;
            finalNum--;
        }
        return answer;
    }
}
