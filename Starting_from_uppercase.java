package Practice.Recursion_3.Strings.Assignment;

import java.util.Scanner;

public class Starting_from_uppercase {
    static String uppercase(String s ,int idx){
        if (idx==s.length()){
            return "";
        }
        char currchar=s.charAt(idx);
        if (Character.isUpperCase(currchar)){
            return s.substring(idx);
        }
        else{
            return uppercase(s,idx+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println(uppercase(s,0));

    }
}
