
package Hacker_Rank;

import java.util.Scanner;


public class SubStringComparisons {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.next();
        int k=input.nextInt();
        int m=s.length();
        String st=s.substring(0, k);
        String end  =s.substring(m-k, m);
        System.out.println(st+"\n"+end);        
    }
    
}
