
package GFG_JAVA;
public class StaticVariable {  
}


class Counter2{  
    static int count=0;//will get memory only once and retain its value  
   int count1=0;
    Counter2()
    {  
        count++;//incrementing the value of static variable  
        count1++;
        System.out.println("Static: "+count+"    Non-Static: " +count1 );  
    }  
  
public static void main(String args[])
{  
//creating objects  
    Counter2 c1=new Counter2();  
    Counter2 c2=new Counter2();  
    Counter2 c3=new Counter2();  
}  
}  