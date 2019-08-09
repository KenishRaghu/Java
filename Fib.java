import java.util.*;
public class Fib
{
      public static void main(String args[])
      { Scanner sc=new Scanner(System.in);
          System.out.println("enter n");
           int n=sc.nextInt();
           int n3;
           int n1=1;
           int n2=1;
         System.out.print("11");
         for(int i=2;i<n;i++)
             {
               n3=n1+n2;
 	System.out.print(n3);                
		 n1=n2;
                n2=n3;
             
        
}
}
}