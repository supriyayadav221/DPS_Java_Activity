package activities;
import java.util.Scanner;
public class fifth {
	static boolean primeOrNot(int num)
	{
		boolean flag=false;
		if(num==0||num==1)
		{
			flag=true;
		}
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}
		return flag;
	}
	static int sumPrimeArray(int array[],int size) {
		int sum=0;
		for(int i=0;i<size;i++)
		{
		if(!primeOrNot(array[i]))
		{ sum=sum+array[i];}
		
			 
		}
		
		return sum;
	}
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n<0)
{
	System.out.println("Invalid array size");
	}
else {
int arr[]=new int[n];
for (int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
	if(arr[i]<0) {
		System.out.println("Invalid input");
		break;
	}
}
System.out.print(sumPrimeArray(arr,n));
}
}
}
