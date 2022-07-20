package q2;
import java.util.Scanner;
import java.io.*;
import java.util.*;
class Quadratic_Equation
{
	public static void main(String[] args) 
	{
		int a,b,c;
		double root1,root2,det;
		System.out.println("Given quadratic equation : ax^2 + bx + c");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a : ");
		a=sc.nextInt();
		System.out.print("Enter b : ");
		b=sc.nextInt();
		System.out.print("Enter c : ");
		c=sc.nextInt();
		System.out.print("Given quadratic equation : ");
		System.out.printf("%dx^2 + %dx + %d",a,b,c);
		det=b*b-4*a*c;
		System.out.println("");
		if(det>0)
		{
			System.out.println("Roots are real and unequal");
			root1=(-b+Math.sqrt(det))/(2*a);
			root2=(-b-Math.sqrt(det))/(2*a);
			System.out.println("First root is : "+root1);
			System.out.println("Second root is : "+root2);
		}
		if(det==0)
		{
			System.out.println("Roots are real and equal");
			root1=root2=-b/(2*a);
			System.out.println("Root : "+root1);
			
		}
		if(det<0)
		{
			System.out.println("Roots are imaginary");
		}
	}
}