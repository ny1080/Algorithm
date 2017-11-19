package Chap01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 숫자의 개수를 입력해주세요 :  ");
        int n = sc.nextInt();
        int [] data = new int[n];
        System.out.print("입력할 숫자를 입력해주세요 :  ");
        for (int i=0; i<n; i++){
            data[i] = sc.nextInt();
        }

        int sum= 0;
        int max= data[0];
        for(int i= 0; i<n; i++){
            sum += data[i];

            if(data[i]>max){
                max =data[i];
            }
        }

        System.out.println("sum:  " +sum);
        System.out.println("max:  " +max);
    }
}
