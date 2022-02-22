import java.util.Scanner;

class Line
{
	//Method with return-type for  scanning coordinates of line from user and to solve the line length
		public static int getLengthOfLine(Scanner scanner) 
		{
			System.out.println("Please enter x1");
			int x1 = scanner.nextInt();

			System.out.println("Please enter y1");
			int y1 = scanner.nextInt();

			System.out.println("Please enter x2");
			int x2 = scanner.nextInt();

			System.out.println("Please enter y2");
			int y2 = scanner.nextInt();
			
			//Calculating Line length
			int val1 = (int) Math.pow((x2 - x1), 2);
			int val2 = (int) Math.pow((y2 - y1), 2);
			int result = (int) Math.sqrt(val1 + val2);

			return result;
		}
		//Method with no return type for getting 2lines
		public void length()
		{
			Scanner scanner = new Scanner(System.in);
			//calling method for line 1 length calculation
			System.out.println("Please enter values for line 1");
			int lengthOfline_1 = getLengthOfLine(scanner);
			
			//calling method for line 2 length calculation
			System.out.println("Please enter values for line 2");
			int lengthOfline_2 = getLengthOfLine(scanner);

			String val1=String.valueOf(lengthOfline_1);
			String val2=String.valueOf(lengthOfline_2);

			if(val1.equals(val2)){
                System.out.println("Both lines are equal");
			}
			else {
                System.out.println("Both lines are not equal");
			}
			scanner.close();
		}
}       
public class EqualityUC2
{

	public static void main(String[] args)
	{
		//creating an object
		Line equality = new Line();
		
		//calling Method
		equality.length();

	}

}
