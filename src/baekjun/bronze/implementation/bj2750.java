package baekjun.bronze.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class bj2750 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] nums = new int[num];
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            nums[i] = scanner.nextInt();
        }

        Arrays.sort(nums);

        for (int i = 0; i < num; i++) {
            if(!arr.contains(nums[i])){
                arr.add(nums[i]);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

    }

}
//    첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다.
//    둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.