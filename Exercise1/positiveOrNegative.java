package Exercise1;

import java.util.Scanner;

public class positiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.println("Number is Positive");
        }else{
            System.out.println("Number is Negative");
        }
        sc.close();
    }

}
