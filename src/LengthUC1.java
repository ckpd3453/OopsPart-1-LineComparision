import java.util.Scanner;

class Length
{
	void calculation()
	{
		//user input for coordinates of line
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter x1");
        int x1 = scanner.nextInt();
       
        System.out.println("Please enter y1");
        int y1 = scanner.nextInt();
       
        System.out.println("Please enter x2");
        int x2 = scanner.nextInt();
       
        System.out.println("Please enter y2");
        int y2 = scanner.nextInt();
       
        //length calculation
        int val1 = (int) Math.pow((x2-x1), 2);
        int val2 = (int) Math.pow((y2-y1), 2);
        int result = (int) Math.sqrt(val1+val2);
       
        System.out.println("Length of line = "+result);
       
        scanner.close();
	}
}
public class LengthUC1
{

	public static void main(String[] args)
	{
		//creating object
		Length line = new Length();

		//calling method
		line.calculation();

	}

}
