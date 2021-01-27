package Exercise1;

import java.util.Scanner;

public class Armstrong3digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 digit number : ");
        int num = sc.nextInt();
        if(is3digit(num)){
            System.out.println("Number should be 3 digit only.");
            System.exit(0);
        }

        int i = num;
        int rem;
        int checkNum=0;
        while(i>0){
            rem=i%10;
            checkNum += (rem*rem*rem);
            System.out.println(checkNum);
            i = i/10;
        }
        if(checkNum == num){
            System.out.println(num+" is armstrong number.");
        }else{
            System.out.println(num+" is not armstrong number.");
        }



    }
    static boolean is3digit(int i){
        int j = i;
        int count=0;
        // int rem;
        while(j>0){
            // rem = j%10;
            count++;
            j=j/10;
        }
        // System.out.println("count = "+count);
        if(count == 3){
            return false;
        }else{
            return true;
        }
    }
}
