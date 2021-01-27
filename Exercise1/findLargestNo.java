package Exercise1;

import java.util.Scanner;

public class findLargestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        int maxNum;
        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        maxNum = a[0];
        for(int i : a){
            if(i>maxNum){
                maxNum = i;
            }
        }
        System.out.println("maximum Number = "+maxNum);
        sc.close();
    }
}
