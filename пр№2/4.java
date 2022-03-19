/*4.	Дaн двyмepный мaccив A, pasмepoм (nхn) (или квaдpaтнaя мaтpицa A). Haйти пpoиsвeдeниe 
минимaльнoгo и мaкcимaльнoгo   элeмeнтoв eë глaвнoй диaгoнaли. Зaтeм yмнoжить пo6oчнyю диaгoнaль нa мaкcимaльный элeмeнт глaвнoй диaгoнaли.*/

import java.util.Arrays;
import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n= ");
        int n= in.nextInt();
        int a[][]=new int[n][n];
        
        System.out.println("Исходный массив ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=(int)(Math.random()*15-3);
                System.out.print(a[i][j]+" ");

            }
            System.out.println();
        }
        int min=a[0][0];
        int max=a[0][0];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    if(a[i][j]<min){
                        min=a[i][j];
                        
                    }
                    if(a[i][j]>max){
                        max=a[i][j];
                        
                    }
                }

            }

        }
        System.out.println("\n"+"Произведение максимального и минимального элемента главной диагонали "+min*max+"\n");
        System.out.println("Нужный массив ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==n-j-1){
                    a[i][j]*=max;

                }
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


    }}
