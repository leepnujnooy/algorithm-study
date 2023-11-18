package baekjun.silver.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class bj10866 {
    public static void main(String[] args) throws IOException {


//        Scanner scanner = new Scanner(System.in);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bufferedReader.readLine());

        String[] strings = new String[num];

        for (int i = 0; i < num; i++) {
            strings[i] = bufferedReader.readLine();
        }

        LinkedList<String> linkedList = new LinkedList<>();

        for (int i = 0; i <num ; i++) {
            if(strings[i].contains("push_front")){
                linkedList.addFirst(strings[i].split(" ")[1]);
            }
            else if(strings[i].contains("push_back")){
                linkedList.addLast(strings[i].split(" ")[1]);
            }



            if(strings[i].equals("front")){
                if(!linkedList.isEmpty()){
                    System.out.println(linkedList.getFirst());
                }
                else{
                    System.out.println("-1");
                }
            }
            else if(strings[i].equals("back")){
                if(!linkedList.isEmpty()){
                    System.out.println(linkedList.getLast());
                }
                else{
                    System.out.println("-1");
                }
            }
            else if(strings[i].equals("pop_front")){
                if(!linkedList.isEmpty()){
                    System.out.println(linkedList.pollFirst());

                }
                else{
                    System.out.println("-1");
                }
            }
            else if(strings[i].equals("pop_back")){
                if(!linkedList.isEmpty()){
                    System.out.println(linkedList.pollLast());
                }
                else{
                    System.out.println("-1");
                }
            }
            else if(strings[i].equals("size")){
                System.out.println(linkedList.size());
            }
            else if(strings[i].equals("empty")){
                if(linkedList.isEmpty()){
                    System.out.println("1");
                }
                else{
                    System.out.println("0");
                }
            }

        }


    }
}
