package etc;

import java.util.Scanner;
import java.util.Stack;

public class Crafton3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        System.out.println(solution(S));
    }

    public static int solution(String S){
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            char character = S.charAt(i);
            int stackSize = stack.size();

            if(character == '*'){
                if(stackSize < 2) return -1;
                int tempInt1 = stack.pop();
                int tempInt2 = stack.pop();
                stack.push(tempInt1 * tempInt2);
            }
            else if(character == '+'){
                if(stackSize < 2) return -1;
                int tempInt1 = stack.pop();
                int tempInt2 = stack.pop();
                stack.push(tempInt1 + tempInt2);
            }
            else{
                stack.push(Integer.parseInt(String.valueOf(character)));
            }
        }
        return stack.peek();
    }
}
