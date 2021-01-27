package Exercise1;

import java.util.Scanner;

public class fibonacciUptoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        int c;
        for(int i = 0;; i++) {
            c = a+b;
            if(c<=num){

                System.out.print(c+" ");

            }else{
                i =0;
                break;
            }
            a=b;
            b=c;
        }
        sc.close();
    }

}
