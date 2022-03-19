/*4)	Oпpeдeлить дoпoлнитeльный мaccив paзpeшeнныx знaчeний. Oпpeдeлить и вывecти нa экpaн,
cкoлькo элeмeнтoв иcxoднoгo мaccивa имeют paspeшeнныe знaчeния*/


import java.util.Arrays;
import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Размер массива = ");
        int n= in.nextInt();
        int b[]=new int[n];
        int per=0;
        System.out.println("Исходный массив ");
        for(int i=0;i<n;i++){
            b[i]=(int)(Math.random()*100-35);
            System.out.print(b[i]+",");

        }
        System.out.print("\n");
        System.out.print("Кол-во разрешенных элементов = ");
        int k= in.nextInt();
        int a[]=new int[k];

        for(int i=0;i<k;i++){
            a[i]=in.nextInt();



        }
        for(int i=0;i<k;i++){
            System.out.print(a[i]+",");
        }
        for(int i=0;i<b.length;i++){
            for(int j=0;j<a.length;j++){
                if(b[i]==a[j]){

                    per+=1;
                }
            }}
        System.out.println();
        System.out.println("Количество чисел с разрешенными значениями "+per);

    }
}
