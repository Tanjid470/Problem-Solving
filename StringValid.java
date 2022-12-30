
package GFG_JAVA;

import java.util.Scanner;

public class StringValid {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         int t=input.nextInt();
    while(t-->0){
           
        String name=input.nextLine();
            int i=1;
            int flag =0;
            
            if(( (name.charAt(0)>='a' && name.charAt(0)<='z' ) || (name.charAt(0)>='A' && name.charAt(0)<='Z')) && name.length()>=8 )
            {
                for (i = 1; i < name.length(); i++)
                {
                  if( (name.charAt(i)>='a' && name.charAt(i)<='z') || (name.charAt(i)>='A' && name.charAt(i)<='Z') || name.charAt(i)=='_' || (name.charAt(i)>='0' && name.charAt(i)<='9') ){
              
                  }
                  else{
                      System.out.println("Invalid");
                      flag=1;
                      break;
                  }
                }
                if(flag==0)
                {
                    System.out.println("Valid");
                }
            }
            else{
                System.out.println("Invalid");
            }
             
        
         }
    }
  
}
