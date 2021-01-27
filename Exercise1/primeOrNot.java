package Exercise1;

import java.util.*;

class PrimeOrNot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // boolean flag =  true;
        var count =0 ;
        for(int i=2;i<num;i++){
            if( num%i == 0 ){
                count++;
            }
        }

        if(count == 0){
            System.out.println("Number is a Prime Number");
        }else{
            System.out.println("Number is not a Prime Number");
        }
        sc.close();
    }
}
