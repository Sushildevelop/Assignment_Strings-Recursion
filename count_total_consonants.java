package Practice.Recursion_3.Strings.Assignment;

import java.awt.*;
import java.util.Scanner;

public class count_total_consonants {
    static int totalconsonants(String s,int n){

        if (n==1){
            if (isconsonant(s.charAt(0))){
                return 1;

            }
            else{
                return 0;
            }
        }
        if (isconsonant(s.charAt(n-1))){
            return totalconsonants(s,n-1) +1;
        }
        else {
            return totalconsonants(s,n-1);
        }
    }
    public static boolean isconsonant(char ch){
        ch=Character.toLowerCase(ch);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println(totalconsonants(s,s.length()));
    }
}
