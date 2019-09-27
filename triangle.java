public class triangle extends shape
{
  triangle(int aa,int bb)
  {
    a=aa;
    b=bb;
  }
 void printarea()
{
   double area=0.5*a*b;
   System.out.println("Area="+area);
}
}
