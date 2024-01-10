package baekjun.silver.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dp11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[] nums = new int[1001];

        nums[1] = 1;
        nums[2] = 2;

        for (int i = 3; i <= num; i++) {
            nums[i] = (nums[i-1] + nums[i-2])%10007;
        }

        System.out.println(nums[num]);

    }
}
