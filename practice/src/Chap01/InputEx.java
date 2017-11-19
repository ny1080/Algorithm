package Chap01;

import java.util.Scanner;

public class InputEx {
    public static void main(String[] args) {

        int num = 1234;

        Scanner sc = new Scanner(System.in);

        System.out.print("입력하세요");

        int input = sc.nextInt();

        if(input==num){
            System.out.println("같습니다");
        }else{
            System.out.println("다릅니다");
        }
        sc.close();
    }
}
