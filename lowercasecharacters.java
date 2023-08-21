package Practice.Recursion_3.Strings.Assignment;

import java.util.Scanner;

public class lowercasecharacters {
    static int lower(String s , int idx){
        if (idx==s.length()-1){
            if (s.charAt(idx)>=97 && s.charAt(idx)<=122){
                return 1;
            }
            else {
                return 0;
            }
        }
        if (s.charAt(idx)>=97 && s.charAt(idx)<=122){
            return lower(s,idx+1)+1;

        }
        else{
            return lower(s,idx+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(lower(s,0));
    }
}
