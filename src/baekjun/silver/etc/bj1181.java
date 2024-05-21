package baekjun.silver.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class bj1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        String[] strings = new String[num];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = bufferedReader.readLine();
        }

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }
                else{
                    return o1.length() - o2.length();
                }
            }
        });

        System.out.println(strings[0]);
        for (int i = 1; i < strings.length; i++) {
            if(!strings[i].equals(strings[i-1])) System.out.println(strings[i]);
        }


//        int num = Integer.parseInt(bufferedReader.readLine());
//        StringBuilder stringBuilder = new StringBuilder();
//        ArrayList<String> tmpList = new ArrayList<>();
//
//        for (int i = 0; i < num; i++) {
//            String temp = bufferedReader.readLine();
//            if(!tmpList.contains(temp)) tmpList.add(temp);
//        }
//
//        String[] newArr = new String[tmpList.size()];
//        for (int i = 0; i < newArr.length; i++) {
//            newArr[i] = tmpList.get(i);
//        }
//
//        //길이별로 줄 세우기
//        for (int i = 0; i < newArr.length; i++) {
//            for (int j = i+1; j < newArr.length; j++) {
//                if(newArr[i].length() > newArr[j].length()){
//                    // im > i
//                    String tmp = newArr[i];
//                    newArr[i] = newArr[j];
//                    newArr[j] = tmp;
//                }
//                else if(newArr[i].length() == newArr[j].length()){
//                    String tmp = newArr[i];
//                    String tmp2 = newArr[j];
//                    for (int k = 0; k < tmp.length(); k++) {
//                        //알파벳이 더 크면 b a
//                        if(tmp.charAt(k) > tmp2.charAt(k)){
//                            newArr[i] = tmp2;
//                            newArr[j] = tmp;
//                            break;
//                        }
//                    }
//                }
//            }
//        }
//
//
//        for (int i = 0; i < newArr.length; i++) {
//            stringBuilder.append(newArr[i]).append("\n");
//        }
//        System.out.println(stringBuilder);
    }
}
