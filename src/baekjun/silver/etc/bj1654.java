package baekjun.silver.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bj1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] lines = new int[K];
        for (int i = 0; i < K; i++) lines[i] = Integer.parseInt(bufferedReader.readLine());

        Arrays.sort(lines);

        long right = lines[K-1];
        long left = 1;
        long count, half;

        while(left<=right) {
            count = 0;
            half=(left+right)/2;

            for(int i=0;i<K;i++) count += lines[i]/half;

            if(count<N) right = half-1;
            else left = half+1;
        }

        System.out.println(right);



//        String[] num = bufferedReader.readLine().split(" ");
//        int num1 = Integer.parseInt(num[0]);
//        int num2 = Integer.parseInt(num[1]);
//
//        int[] arr = new int[num1];
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = Integer.parseInt(bufferedReader.readLine());
//            sum += arr[i];
//        }
//        Arrays.sort(arr);
//        bufferedReader.close();
//
//        int max = sum / num2; //231
//        int min = 1;
//
//        while(true){
//            int tmp = 0;
//            int tmp2 = 0;
//            for (int i = 0; i < arr.length; i++) {
//                tmp += arr[i] / max;
//                tmp2 += arr[i] / min;
//            }
//            if(tmp == num2){
//                System.out.println(max);
//                break;
//            }
//            else if(tmp2 == num2){
//                System.out.println(min);
//                break;
//            }
//            else{
//                max--;
//                min++;
//            }
//        }
//

    }
}
