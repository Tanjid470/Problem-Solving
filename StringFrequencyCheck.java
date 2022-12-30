
package Hacker_Rank;

import java.util.Scanner;

public class StringFrequencyCheck {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] count=new int[256];
        String s1=input.next();
        String s2=input.next();
        char c;
       
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;   
        }
        System.out.println(""+count);        
    }
 
}
