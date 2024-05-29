package baekjun.bronze.etc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bj10809 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine(); //back
        int[] intArr = new int[26];
        List<Character> dupCheck = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            char temp = string.charAt(i); //b == 66
            if(dupCheck.contains(temp)){
                continue;
            }
            else{
                dupCheck.add(temp);
            }
            int tempInt = temp - 97; //tempInt = 1
            if(i == 0){
                intArr[tempInt]= -2;
            }
            else{
                intArr[tempInt]+=i;
            }
        }

        for (int i = 0; i < intArr.length; i++) {
            if(intArr[i] == 0){
                System.out.print("-1 ");
            }
            else if (intArr[i] == -2) {
                System.out.print("0 ");
            }
            else{
                System.out.printf("%d ",intArr[i]);
            }
        }

    }
}
