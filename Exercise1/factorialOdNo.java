package Exercise1;

import java.util.Scanner;

public class factorialOdNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact =1 ;
        for(int i=num; i>0; i--) {
            fact *= i;
        }
        System.out.println("factorial of "+num+" is "+fact);
        sc.close();
    }

}
