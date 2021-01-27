package Exercise1;

import java.util.Scanner;

public class armstrongofNdigit {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int digit = is3digit(num);


        int i = num;
        int rem;
        int checkNum=0;
        while(i>0){
            rem=i%10;
            checkNum += Math.pow(rem,digit);
            // System.out.println(checkNum);
            i = i/10;
        }
        if(checkNum == num){
            System.out.println(num+" is armstrong number.");
        }else{
            System.out.println(num+" is not armstrong number.");
        }



    }
    static int is3digit(int i){
        int j = i;
        int count=0;
        // int rem;
        while(j>0){
            // rem = j%10;
            count++;
            j=j/10;
        }
        // System.out.println("count = "+count);
        return count;
    }
}
