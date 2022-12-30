
package Hacker_Rank;


import java.util.Scanner;


public class StringReverse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       
        String s1 = "" ;
        String s;
        s=input.next();
        s=s.toLowerCase();
        char a;
        for (int i = 0; i < s.length(); i++) {
            a=s.charAt(i);
            s1=a+s1; 
              System.out.println(""+s1);
        }
        System.out.println(""+s1); 
        if(s.equals(s1)){
            System.out.println("yes");            
        }
        else{
            System.out.println("no");            
        }
         
    }
   
}
