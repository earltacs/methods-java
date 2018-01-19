/**
 * AWT Sample application
 *
 * @author 
 * @version 1.00 18/01/19
 */
 import java.util.Scanner;
public class Seatwork {  
	public static int num1, num2;
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
	    String op;
    	System.out.println("Which operation do you wish?(Add, Subtract, Multiply, Average)");
    	op = in.next();
    	
    	if(op.equalsIgnoreCase("Add") == true) {add();}
    	else if(op.equalsIgnoreCase("Subtract") == true) {subtract();}
    	else if(op.equalsIgnoreCase("Multiply") == true) {multiply();}
    	else if(op.equalsIgnoreCase("Average") == true) {average();}
    	else if(op.equalsIgnoreCase("Stop") == true) {System.exit(0);}
    	else{System.out.print("Operator not found");}
    }
    public static void add()
    {
    	System.out.println("Enter first number: ");
    	num1 = in.nextInt();
    	System.out.println("Enter second number: ");
    	num2 = in.nextInt();
    	System.out.printf("The sum of %d and %d is: %d\n", num1, num2, num1+num2);
    	System.out.println("You can type Stop to stop the program.");
    	main(null);
    }
    public static void subtract()
    {
    	System.out.println("Enter first number: ");
    	num1 = in.nextInt();
    	System.out.println("Enter second number: ");
    	num2 = in.nextInt();
    	System.out.printf("The difference of %d and %d is: %d", num1, num2, num1-num2);
    	main(null);
    }
    public static void multiply()
    {
    	System.out.println("Enter first number: ");
    	num1 = in.nextInt();
    	System.out.println("Enter second number: ");
    	num2 = in.nextInt();
    	System.out.printf("The product of %d and %d is: %d", num1, num2, num1*num2);
    	main(null);
    }
    public static void average()
    {
    	System.out.println("Enter first number: ");
    	num1 = in.nextInt();
    	System.out.println("Enter second number: ");
    	num2 = in.nextInt();
    	System.out.printf("The average of %d and %d is: %d", num1, num2, (num1+num2)/2);
    	main(null);
    }
}