package Chap01;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] data= new int[n];
        for(int i=0; i<n; i++){
            data[i] = sc.nextInt();
        }
        sc.close();

        int temp = data[n-1];

        for(int i= n-2;i>=0; i--){
            data[i+1] = data[i];
        }
        data[0] = temp;

        for(int i = 0; i<n ;i++) {
            System.out.println(data[i]);
        }
    }
}
