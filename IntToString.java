
package Hacker_Rank;

import java.util.Scanner;


public class IntToString 
{
    public static void main(String[] args) 
    {
        Scanner Input=new Scanner(System.in);
        int i;
        i=Input.nextInt();
        if(i>-101 && i<101){
             String s=Integer.toString(i);
             if(i ==Integer.parseInt(s)){
                      System.out.println("Good job");    
             }
             else{
                 System.out.println("Wrong answer.");                 
             }
     
        }
          
    }
                
        
}
    

