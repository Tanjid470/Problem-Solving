
package Hacker_Rank;

import java.util.Scanner;


public class SubString {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        String sen;
        SubString Sub=new SubString();
       
  
        sen=input.next();
        int s=input.nextInt();
        int e=input.nextInt();
        String low=sen.substring(s, e);
        System.out.println(low);        
       
    
    }
}
