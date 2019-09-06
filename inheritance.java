import java.util.*;
class account{
	String name;
	String id;
	int balance;
	void input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		name=sc.next();
		System.out.println("enter the id");		
		id=sc.next();
		System.out.println("enter the balance");
		balance=sc.nextInt();
		}	
  	void display(){
		System.out.println(name);
		System.out.println(id);
		System.out.println(balance);
		}
		
	}

class saving extends account{
	double rate;
        double time;
	void input1(){
		input();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rate");
	  	rate=sc.nextDouble();
		System.out.println("enter the time duration");
		time=sc.nextDouble();
		}
	double compute(){
		return ((rate*time*balance)/100);
		}
	void display1(){
		display();
		System.out.println(compute());
		}
	}
class inheritance{
	public static void main(String args[])
	{
		double z;		
		saving ob=new saving();
		ob.input1();
		z=ob.compute();
		System.out.println(z);
		ob.display1();
	}
}
		
	
