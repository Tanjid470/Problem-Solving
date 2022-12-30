
package GFG_JAVA;

import java.util.Scanner;


public class String1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s1="tanjiD";// memory allocate in String constant pool
        String s2=new String("AMran");//memory allocate in Heap
        char name[]={'T','a','n','j','i','d'};
        System.out.println(name);
        
     //===============================   
        //Start Index UpperCase
        String firstLetterS1= s1.substring(0, 1);
        String LastAllLetterS1= s1.substring(1, s1.length());
        firstLetterS1=firstLetterS1.toUpperCase();
        LastAllLetterS1=LastAllLetterS1.toLowerCase();
        s1=firstLetterS1+LastAllLetterS1;
        
        String firstLetterS2= s2.substring(0, 1);
        String LastAllLetterS2= s2.substring(1, s2.length());
        firstLetterS2=firstLetterS2.toUpperCase();
        LastAllLetterS2=LastAllLetterS2.toLowerCase();
        s2=firstLetterS2+LastAllLetterS2;
         
        String addd=s1.concat(s2);
    //================================   
        
        System.out.println(addd);
       //                 ternary operator
       boolean m=s1.contains("ani") ? true : false; // substring check
       System.out.println("Is S1 contains 'ani'  S2   :"+m);
       
       boolean m3=s1.equalsIgnoreCase(s2) ? true : false; // IgnoreUpperLowerCase
       System.out.println("Match s1 & s2 ignoreUpperLowerCase : "+m3);
       
       boolean m2=s1.equals(name) ? true : false; // String equal check
       System.out.println("S1 equals name : "+m2);
       
  
        boolean empty=s1.isBlank(); //Check string is empty or not
        System.out.println(empty);
        
        System.out.print("Check char at this position:");
        int i=input.nextInt();
        char value = s1.charAt(i);  // position wise char check
        System.out.println(value);
        
        
        String rr= s1.concat(s2);  // Concat means addition 2 string
        System.out.println(rr);
        
        //ASCII value
        int ASCII=s1.codePointAt(4);
        System.out.println("ASCII Value :"+ASCII);
        
        
        // Indexof
        int index=s1.indexOf('a');
        System.out.println(index);
        
        int LastIndex=s1.lastIndexOf('a');
        System.out.println(LastIndex);
        
        // Remove first & last space
        String sen=" My name is Tanjid  ";
        sen=sen.trim();
        System.out.println("REMOVE First & Last space :"+sen);
        
        
        System.out.println("\n\n\n\n\n");
    
    }
  
    
    
    
}
