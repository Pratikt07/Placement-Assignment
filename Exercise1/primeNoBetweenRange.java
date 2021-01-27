package Exercise1;

import java.util.Scanner;

public class primeNoBetweenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Prime numbers between "+a+" and "+b+" : ");
        int i=a;
        while(i<b){
            if(i==1 || i==0){
                i++;
                continue;
            }else if(i==2){
                System.out.println(i+" ");
                i++;
                continue;
            }
            int count =0 ;
            for(int j=2;j<i;j++){
                // System.out.println(i+" "+j+" ");
                if(i%j==0 ){
                    count++;
                    continue;
                }else{
                    break;
                }
            }
            if(count==0){
                System.out.print(i+" ");
            }
            i++;
        }
        sc.close();
        System.out.println("");
    }
}
