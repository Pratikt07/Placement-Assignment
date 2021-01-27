package Exercise1;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a =0;
        int b=1;
        System.out.print(a+", "+b+", ");
        int c;
        for(int i=0;i<num-2;i++){
            c=a+b;
            if(i==num-3){
                System.out.print(c+" ");
            }else{
                System.out.print(c+", ");
            }
            a=b;
            b=c;
            sc.close();
        }
    }
}
