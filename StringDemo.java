
package GFG_JAVA;

import java.util.Scanner;


public class StringDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //String to Integer convert
        String s="100";
        int x=Integer.valueOf(s);
        int i=Integer.parseInt(s);
        System.out.println(x+"  "+i);
        
        //Integer to string convert
        int k=800;
        String s2=Integer.toString(k);
        System.out.println(" "+k);
        
        System.exit(0);        
    }  
}
