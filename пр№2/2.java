/*4)	Дaн мaccив b (n) . Пepeпиcaть в мaccив C(n) oтpицaтeльныe элeмeнты мaccивa b(n) yмнoжeнныe нa 4. 
(co cжamueм., бeз nycmыx элeмeнmoв внympu). Зaтeм yпopядoчить 
мeтoдoм «вы6opa и пepecтaнoвки»пo вospacтaнию нoвый мaccив.*/



import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Размер массива = ");
        int n= in.nextInt();
        int b[]=new int[n];
        System.out.println("Исходный массив ");
        for(int i=0;i<n;i++){
            b[i]=(int)(Math.random()*100-35);
            System.out.print(b[i]+",");
        }
        int g=0;

        for(int i=0;i<n;i++){
            if(b[i]<0){
                g+=1;
            }}

        int c[]=new int[g];
        g=0;

        System.out.println("\n");
        for(int el:b){
            if(el<0){
                el*=4;
                c[g++]=el;
            }
        }
        for(int min=0;min<c.length;min++){
            int per=min;
            for(int j =min+1;j<c.length;j++){
                if(c[j]>c[per]){
                    per=j;
                }
                int tpn=c[min];
                c[min]=c[per];
                c[per]=tpn;
            }
        }
        System.out.println("Новый массив ");
        for(int i=0;i<g;i++){

            System.out.print(c[i]+",");
        }
        
    }
    
}
