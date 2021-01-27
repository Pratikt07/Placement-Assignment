package Exercise1;

import java.util.Scanner;

public class armstrongNoBetweenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter a and b : ");
        a = sc.nextInt();
        b = sc.nextInt();
        for (int i = a;i<=b;i++){
            int digit = getDigit(i);
            int j = i;
            int rem=0;
            int checkNum=0;
            while(j>0){
                rem = j%10;
                checkNum += Math.pow(rem, digit);
                j /= 10;
            }
            if(i == checkNum){
                System.out.print(i+" ");
            }
        }
    }
    static int getDigit(int i){
        int count = 0;
        while(i>0){
            count++;
            i /= 10;
        }
        return count;
    }

}
