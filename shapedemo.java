public class shapedemo
{
  public static void main(String[] args)
   {  
      shape s1;
        s1=new triangle(3,4);
        s1.printarea();
        s1=new rectangle(3,4);
        s1.printarea();
        s1=new circle(3,0);
        s1.printarea();
    }
}
