package baekjun.silver.implementation;

import java.util.Scanner;
import java.util.Stack;

public class bj10773 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            int temp = scanner.nextInt();
            if(temp == 0){
                stack.pop();
            }
            else{
                stack.push(temp);
            }
        }

        int sum = 0;

        for (int i = 0; i < stack.size(); i++) {
            sum += stack.get(i);
        }

        System.out.println(sum);
    }
}
