/*Oпpeдeлить мaтpицy (двyмepный мaccив) и ee зaпoлнить cлyчaйными знaчeниями
Пocтpoить вeктop B, кoтopoй вosвpaщaeт –мaкcимaльнoe sнaчeниe в i-м cтoл6цe;*/

import java.util.Arrays;
import java.util.*;
import java.util.Vector;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Кол-во строк ");
        int n= in.nextInt();
        System.out.print("Кол-во столбцов ");
        int m= in.nextInt();
        int a[][]=new int[n][m];
        int per=0;
        int per2=0;

        System.out.println("Исходный массив ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=(int)(Math.random()*10);
                System.out.print(a[i][j]+" ");

            }
            System.out.println();
        }
        int c[]=new int [m];
        Vector b = new Vector();
        int max=a[0][0];
        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++) {

                if(max < a[j][i]){
                    max=a[j][i];
                    c[i]=max;
                }


            }

            max=0;
        }

        System.out.println("\n"+"Вектор B ");

        for(int i=0;i<m;i++){

            b.add(c[i]);
        }
        System.out.println(b);
    }
}
