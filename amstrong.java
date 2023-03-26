import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int num,temp,remainder,result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		num=sc.nextInt();
		temp=num;
		while(num!=0)
		{
		    remainder=num%10;
		    result=result+(remainder*remainder*remainder);
		    num=num/10;
	}
	if(result==temp)
	{
	    System.out.println("Its a Amstrong");
	}
	else{
	    System.out.println("Its a not Amstrong");
	}
}
}