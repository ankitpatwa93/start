package base;

import java.util.Scanner;

public class Fibo 
{

	public static void main(String[] args) 
	{
		 System.out.println("Please enter the position of fib");
		 Scanner s=new Scanner(System.in);		
		 int n=s.nextInt();
		 s.close();
		 System.out.println(new Fibo().getSumAssured(n));
	}
	
	
	public  int getSumAssured(int n)
	{
		
		int firstNo=0;
		int secondNo=1;
		
		int nextNo=0;
		 
		 if(n==0)
		 {
			return nextNo; 
		 }
		 if(n==1)
		 {
			 nextNo=secondNo;
			 return nextNo;
		 }
		 
		 if(n>=2)
		 {
			 for(int i=0;i<n-1;i++)
			 {
				nextNo=firstNo+secondNo;
				firstNo=secondNo;
				secondNo=nextNo;
			 }
		 
		 }
		 return nextNo;
	}
	
	
}
