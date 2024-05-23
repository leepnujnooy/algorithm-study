package baekjun.bronze.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sentence = bufferedReader.readLine();

        String[] strings = sentence.split(" ");
        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            if(!strings[i].equals("")) count++;
        }

        System.out.println(count);
    }
}
