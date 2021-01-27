package Exercise1;

import java.util.Scanner;

public class swapTwoNoWithoutTempVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("before swap a = "+a+" b = "+b);
        // a = a+b;
        // b=a-b;
        // a=a-b;

        // a = 0010
        // b = 0011
        a= a^b;
        // 0001
        System.out.println(a);

        // System.out.println(a);
        b=a^b;
        // 0001
        // 0011
    //xor  0010 = 2
        System.out.println(b);
        a=a^b;
        // 0001
        // 0010
    //xor  0011 = 3
        System.out.println(a);

        System.out.println("before swap a = "+a+" b = "+b);
        sc.close();
    }

}
