package Exercise1;

import java.util.Scanner;

public class charVowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(!Character.isLetter(c)){
            System.out.println("please enter character only");
            System.exit(0);
        }
        switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': System.out.println("character "+c+" is vowel"); break;
            default : System.out.println("character "+c+" is consonant"); break;
        }
        sc.close();
    }
}
