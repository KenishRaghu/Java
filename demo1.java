import java.util.*;
class WrongAge extends Exception
{
	String msg;
	WrongAge(String msg)
	{
		this.msg=msg;
	}
	public String toString()
	{
		return msg;
	}
}
class Father
{
	int f_age;
	Father()
	{
		try{
		
		System.out.println("Enter father's age:");
		Scanner sc=new Scanner(System.in);
		f_age=sc.nextInt();
		if(f_age<0)
		throw new WrongAge("NegativeAgeException");
		}
		catch(WrongAge e){System.out.println(e);}
	}
}
class Son extends Father
{
	int s_age;
	Son()
	{
		super();
		
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter son's age\n");
			s_age=sc.nextInt();
			if(s_age<0)
			throw new WrongAge("NegativeAgeException");
			if(s_age==f_age)
			throw new WrongAge("NegativeAgeException");
		}
		catch(WrongAge e){System.out.println(e);}
		if(s_age>=f_age)
		System.out.println("Illegal");
		else
		System.out.println("Correct Age");
	}
}
class demo1
{	public static void main(String args[])
	{
		Son ob=new Son();
	}
}
