import java.util.*;
class demo{
	int f=-1,r=-1,n;
	Scanner sc=new Scanner(System.in);
	demo(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit of the queue");
		n=sc.nextInt();
		}
	int a[]=new int[n];	
	void insert()
	{
		if(f==-1)
		f++;
		if(r==n)
		{
			System.out.println("queue is full");
			return;
		}
		System.out.println("enter the element");
		int item=sc.nextInt();
		a[++r]=item;
	}
	void delete()
	{
		if(f>r)
		System.out.println("queue is empty");
		f=f+1;
	}
	void display()
	{
		for(int i=f;i<=r;i++)
		System.out.println(a[i]);
	}
}
class queue{
		public static void main(String args[])
		{
			int ch,i=1;
			demo ob=new demo();
			while(i==1)
			{
				System.out.println("1.Insert,2.Delete,3.display,4.exit");
				Scanner sc=new Scanner(System.in);
				ch=sc.nextInt();
				switch(ch){
				case 1: ob.insert();
					break;
				case 2:ob.delete();
					break;
				case 3:ob.display();
					break;
				default: i=0;
				}
			}
		}
	}
