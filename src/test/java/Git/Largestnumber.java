package Git;

import java.util.Scanner;

public class Largestnumber {

	public static void main(String[] args) {

		{
			int x, y, z;
			System.out.println("Enter three integers ");
			Scanner in = new Scanner(System.in);
			x = in.nextInt();// x=10
			y = in.nextInt();// y=20
			z = in.nextInt();// z=30
			if (x > y && x > z)// if(10>20 && 10>30)
				System.out.println("First number is largest.");
			else if (y > x && y > z)// if(20>10 && 20>30)
				System.out.println("Second number is largest.");
			else if (z > x && z > y)// if(30>10 && 30>20)
				System.out.println("Third number is largest.");// hence 30 is greater then all so it will be our output
			else
				System.out.println("Entered numbers are not distinct.");

		}

	}
}
