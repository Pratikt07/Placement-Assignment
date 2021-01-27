package Exercise1;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String(sc.nextLine());
        char str1 [] = str.toCharArray();
        for(int i=0;i<str1.length/2;i++){
            char temp = str1[i];
            str1[i] = str1[str1.length-i-1];
            str1[str1.length-i-1] = temp;
        }
        for(char c :  str1){
            System.out.print(c);
        }
        System.out.println("");

        String str2 = new String(str1);

       if(str.equals(str2)){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not Palindrome");
        }
    }
}
