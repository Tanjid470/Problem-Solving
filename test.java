
package CodeForces;

import java.util.Scanner;


public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0)
        {
           int n=input.nextInt();
           
           if(n<4)
           {
               System.out.println("-1");
           }
           else if(n==4)
           {
               System.out.println("2 4 1 3");
           }
           else
           {
               for (int i = 1; i <=n; i+=2) {
                   System.out.print(i+" ");
               }
               for (int i = 2; i <=n; i+=2) {
                   System.out.print(i+" "); 
               }
           }
        }
        
        System.exit(0);        
    }
    
}
