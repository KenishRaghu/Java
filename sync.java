import java.util.*;
class callme
{
	void call(String msg)
	{
		System.out.println("[" +msg);
		try{
			Thread.sleep(1000);}
			catch(InterruptedException e){
			System.out.println("caught");
			}
			System.out.println("7");
	}
}
class caller implements Runnable {
	String msg;
	callme target;
	Thread t;
	public caller(callme targ,String s)
	{
		target=targ;
		msg=s;
		t=new Thread(this);
		t.start();
		}
	public void run(){
	target.call(msg);
	}
}
class sync{
	public static void main(String args[])
	{
		callme target=new callme();
		caller ob1=new caller(target,"hello");
		caller ob2=new caller(target,"sync");
		caller ob3=new caller(target,"world");
		try{
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
			}
		catch(InterruptedException e){
			System.out.println("interupted");
			}
		}
	}
			
