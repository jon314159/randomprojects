package matt_prime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class find_prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
		  System.out.println("Please input an integer");
		  //nextInt will throw InputMismatchException
		  //if the next token does not match the Integer
		  //regular expression, or is out of range
		  int usrInput=sc.nextInt();
		  find_ans(usrInput);
		}
		catch(InputMismatchException exception)
		{
		  //Print "This is not an integer"
		  //when user put other than integer
		  System.out.println("This is not an integer");
		}
	}
	public static int find_ans(int usrInput) {
		Range.closed(1, 5).asSet(DiscreteDomains.integers());
		Range<Integer> test = Range.between(1, usrInput);
		for (int i=usrInput; i<(.5*usrInput); i++)
		return 0;
				
	}

}
