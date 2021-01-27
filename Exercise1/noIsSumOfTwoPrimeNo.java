package Exercise1;

import java.util.Scanner;

public class noIsSumOfTwoPrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int j=0;j<num/2;j++){
            if(isPrime(j)){
                int k = num-j;
                if(isPrime(k)){
                    System.out.println("Prime pair is "+j+" and "+k);
                }
            }
        }

    }
    static boolean isPrime(int num) {
            boolean flag = false;
        for(int i=2;i<num;i++){
            if(num%i==0){
                flag = true;
                break;
            }
        }
        if(flag){
            return false;
        }else{
            return true;
        }

    }
}
