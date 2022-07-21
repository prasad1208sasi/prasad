import java.util.*;
import java.io.*;
public class Race
{
	public static void main(String args[])
	{
		double b1,b2,b3,b4,b5,avg;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the value of racer1: ");
		b1=input.nextDouble();
		System.out.print("Enter the value of racer2: ");
		b2=input.nextDouble();
		System.out.print("Enter the value of racer3: ");
		b3=input.nextDouble();
		System.out.print("Enter the value of racer4: ");
		b4=input.nextDouble();
		System.out.print("Enter the value of racer5: ");
		b5=input.nextDouble();
		avg=(b1+b2+b3+b4+b5)/5;
		System.out.print("The speed of the racers >= average speed "+avg+" "+": ");
	if(b1>avg)
	System.out.print(" "+b1);
	if(b2>avg)
	System.out.print(" "+b2);
	if(b3>avg)
	System.out.print(" "+b3);
	if(b4>avg)
	System.out.print(" "+b4);
	if(b5>avg)
	System.out.print(" "+b5);
}
}