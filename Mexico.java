import java.util.Scanner;
public class Mexico {
//pop 2014 = 123.8 million
//want a double for pop number in millions when it will reach or exceed that number
//constant growth rate 0.5 % each year
//start = 2014 with 123.8
	
	
	
	public static void main(String[] args) 
	{	
		double pop = 123.8;
		int counter = 2014;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input a year");
		int i = input.nextInt();
		
		if (i < 2014 )
		{
			System.out.println("That is not possible, the population starts at 2014.");
		}
		
		else if (i == 2014)
		{
			System.out.println("The population is 123.8 million.");
		}
		
		while (i > 2014)
		{
			counter ++;
			pop = pop * (1.005);
			
			if (counter == i)
			{
				break;
			}		
		}
		System.out.println("The population in year " + i + " is " + pop + " million." );
	}
}
