package Chap01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BubbleSort {
    static String [] name = new String[1000];
    static String [] number = new String[1000];
    static int n=0;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));

        while(sc.hasNext()){
            name[n] = sc.next();
            number[n] = sc.next();
            n++;
        }
        bubbleSort();

        for(int i=0; i<n; i++){
            System.out.println(name[i]+number[i]);
        }

    }
    public static void bubbleSort(){
        for(int i=n-1; i>0; i--){
            for(int j=0; j<i ; j++){
                if(name[j].compareTo(name[j+1])>0){
                    String tmp = name[j];
                    name[j] = name[j+1];
                    name[j+1] =tmp;
                }
            }
        }
    }
}
