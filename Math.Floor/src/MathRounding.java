import java.lang.Math;
import java.math.RoundingMode;
import java.math.MathContext;
import java.util.Scanner;
public class MathRounding 
{

	public static void main(String[] args) 
	{
		
		int e;
		do
		{
			Scanner input = new Scanner(System.in);
			double y; 
			double x;
			double r; 
			
			System.out.println("please enter number");
			y = input.nextDouble();
			
			System.out.println("do you want it to go to 0, 10, 100, 1000 place?");
			r = input.nextDouble();
			
			// round to integer
			if (r == 0)
			{
				y = Math.floor( y * 10 + 0.5 ) / 1;
				System.out.println(y);		
			}
			
			//rounds to tenth
			if (r == 10)
			{
				 y = Math.floor( y * 10 + 0.5 ) / 10;
				 //System.out.println("y = (y * 10 + 0.5) / 10");
				 System.out.println( y);
			}
			
			 // rounds to Hundredth
			if (r == 100)
			{
				y = Math.floor( y * 10 + 0.5 ) / 100;
				 //System.out.println("y = (y * 10 + 0.5) / 100");
				 System.out.println(y);
			}
			 
			 // rounds to Thousadth
			 if (r == 1000)
			 {
				 y = Math.floor( y * 10 + 0.5 ) / 1000;
				 //System.out.println("y = (y * 10 + 0.5) / 1000");
				 System.out.println(y);
			 }
			 System.out.println("");
			 System.out.println("do you want to go again? 1 for yes 0 for no");
			 e = input.nextInt();
		} while (e == 1);
		
		System.out.println("Goodbye");
		
		/*
		int r;
		do 
		{
			double y;
			int e;
			Scanner input = new Scanner(System.in);
			//getRoundingMode(y);
			System.out.println("please enter number");
			y = input.nextDouble();
			System.out.println("do you want it to go to 0, 10, 100, 1000 place?");
			e = input.nextInt();
			if (e == 1)
			{
				y = Math.floor( y * 10 + 0.5 ) / 1;
				System.out.println(y);
			}
			if (e == 10)
			{
				y = Math.floor( y * 10 + 0.5 ) / 10;
				System.out.println(y);
			}
			if (e == 100)
			{
				y = Math.floor( y * 100 + 0.5) / 100;
				System.out.println(y);
			}
			if (e == 1000)
			{
				y = Math.floor( y * 1000 + 0.5) / 1000;
				System.out.println(y);
			}
			
			System.out.println("do you want to enter in another number? 1 for yes, 0 for no");
			r = input.nextInt();
		} while (r == 1);
		System.out.println("Goodbye");
		*/
			



	}

}
