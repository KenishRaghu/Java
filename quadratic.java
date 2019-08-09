import java.util.*;
import java.lang.Math;
public class quadratic {

	public static void main(String args[]) 
          {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a,b,c");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        
         double d=(b*b)-(4*a*c);
         if(d>0)
         {
        	 double r1=(-b+Math.sqrt(d))/(2*a);
                 double r2=(-b-Math.sqrt(d))/(2*a);
              System.out.println("the roots are "+r1+"and"+r2);
          }
             if(d==0)
            { 
               double r=-b/(2*a);
               System.out.println("equal roots="+r);
            }
           if(d<0)
            {   
              System.out.println("roots are imaginary");
            }
         }
         
}