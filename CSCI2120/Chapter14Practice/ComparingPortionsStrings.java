package Chapter14Practice;

import java.util.*;

public class ComparingPortionsStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1 = input.nextLine();
        System.out.println("Enter the second string: ");
        String s2 = input.nextLine();
        input.close();

        if(s1.regionMatches(true,0,s2,0,2)) {
            System.out.println("First 2 characters of s1 and s2 match");
        }
        else {
            System.out.println("First 2 characters of s1 and s2 do not match");
        }
    }
}
