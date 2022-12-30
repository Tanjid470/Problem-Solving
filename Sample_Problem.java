
package KickStart;

import java.util.Scanner;


public class Sample_Problem {
    static int k=1;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int t = input.nextInt();
        while (t-- > 0) {
            int n= input.nextInt();
            int candies=0;
            int child=input.nextInt();
            int[] begs=new int[n];
            
            for (int i = 0; i < n; i++) 
            {
                begs[i]=input.nextInt();
                candies+=begs[i];
            }
            int ExtraCandies=candies%child;
            System.out.println("Case #"+k+": "+ExtraCandies);
            k++;
        }
        
        System.exit(0);        
    }
    
}
