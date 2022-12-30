
package GFG_JAVA;

import java.util.Scanner;


public class String_Buffer 
{
   
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);

        StringBuffer sb=new StringBuffer();
        sb.append("Emran");
        System.out.println(sb);
        
        //sb.reverse();
        //System.out.println(sb);
        
        sb.replace(3, 5, "'replace'");
        System.out.println(sb);
        
        sb.insert(16, "fuck");
        System.out.println(sb);
    }  
}
