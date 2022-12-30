
package Hacker_Rank;

import java.util.Scanner;


public class StringLength {
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
        String A;
        String B;
        A=Input.next();
        B=Input.next();
        int sum=A.length()+B.length();
        System.out.println(sum);


        if(A.length()>B.length())
        {
            System.out.println("No");            
        }
        else
        {
            System.out.println("Yes");            
        }
       
        System.out.println(A+" "+B);        
    }
    
}
