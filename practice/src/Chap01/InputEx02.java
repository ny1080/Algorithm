package Chap01;

import java.util.Scanner;

public class InputEx02 {

    public static void main(String[] args) {
        String str=  "Hello";


        Scanner sc = new Scanner(System.in);

        String input = sc.next(); //한단어만

        if(str.equals(input)){
            System.out.println("String match!!");
        }else{
            System.out.println("String mismatch!!");
        }

    }
}
