
package KickStart;

import java.util.Scanner;


public class Centauri_Prime {
    static int c=1;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            String ss=input.next();
            String s=ss.toLowerCase();
            String y="y";
            char k=s.charAt(s.length()-1);
            String m=String.valueOf(k);
            String alp="aeiou";
            if(m.contains(y)){
                 System.out.println("Case #"+c+": "+ss+" is ruled by nobody."); 
            }
            else if(alp.contains(m))
            {
              System.out.println("Case #"+c+": "+ss+" is ruled by Alice."); 
            }
            else{
               System.out.println("Case #"+c+": "+ss+" is ruled by Bob."); 
            }
            
            c++;
        }
        
        System.exit(0);        
    }
}
