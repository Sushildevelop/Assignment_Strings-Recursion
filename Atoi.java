package Practice.Recursion_3.Strings.Assignment;

import java.util.Scanner;

public class Atoi {
    static int rec(String s, int n){
        if (n==0){
            return s.charAt(0)-'0';
        }
        return (rec(s,n-1)*10+ s.charAt(n)-'0');
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String str = scn.nextLine();
        System.out.println(rec(str, str.length()-1));
    }
}
