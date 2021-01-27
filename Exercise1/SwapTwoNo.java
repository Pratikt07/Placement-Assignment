package Exercise1;

import java.util.Scanner;

public class SwapTwoNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c;

        System.out.println("before swap a = "+a+" b = "+b);
        c = a;
        a= b;
        b= c;
        System.out.println("after swap a = "+a+" b = "+b);
        sc.close();

    }
}
