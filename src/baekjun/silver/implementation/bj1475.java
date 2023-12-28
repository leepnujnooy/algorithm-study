package baekjun.silver.implementation;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class bj1475 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int[] nums = new int[10];

        for (int i = 0; i < str.length(); i++) {
            int num = Character.getNumericValue(str.charAt(i));
            if (num == 6) {
                nums[9]++;
            } else {
                nums[num]++;
            }
        }

        int max = 0;
        for (int i = 0; i < 9; i++) {
            max = Math.max(max,nums[i]);
        }

        int nine = nums[9] / 2;
        if(nums[9] % 2 == 1) nine++;
        max = Math.max(nine,max);
        System.out.println(max);





//        int cnt = 0;
//        int cnt69 = 0;
//
//        List<String> arr = new ArrayList<>();
//
//        for (int i = 0; i < strs.length; i++) {
//            int temp = Integer.parseInt(strs[i]);
//            nums[temp]++;
//        }
//
//
//        for (int i = 0; i < nums.length; i++) {
//            if(i == 6 || i == 9){
//                cnt69 += nums[i];
//                nums[i] = 0;
//            }
//        }
//
//        while(true){
//            int temp = 0;
//            for (int i = 0; i < nums.length; i++) {
//                temp += nums[i];
//                if(nums[i] != 0){
//                    nums[i]--;
//                }
//            }
//            if(temp == 0){
//                break;
//            }
//            cnt++;
//        }
//
//
//        while(true){
//            if(cnt69 >= 2){
//                cnt69 -= 2;
//                cnt++;
//            }
//            else if(cnt69 == 1){
//                cnt69 -= 1;
//                cnt++;
//            }
//            else{
//                break;
//            }
//        }
//
//        System.out.println(cnt);
    }
}
