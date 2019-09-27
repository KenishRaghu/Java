class circle extends shape
{
   circle(int a,int b)
   { 
     this.a=a;
     this.b=b;
   }
   void printarea()
   {
     double area=3.14*a*a;
     System.out.println("Area="+area);
   }
}
 
