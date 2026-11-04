import java.util.Scanner;

public class Java_Calculator {

	public static void main(String[] args) {
		System.out.println("Welcome to the simple calculator");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("Please entre an operator(+,-,*,/,%): ");
		char ch = sc.next().charAt(0);
		
		if (ch == '+') {
			int add = num1+num2;
			System.out.println("Addition of above two numbers is: "+ add);
		}
		if (ch == '-') {
			int sub = num1-num2;
			System.out.println("Subtraction of above two numbers is: "+ sub);
		}
		if (ch == '*') {
			int mul = num1*num2;
			System.out.println("Multiplication of above two numbers is: "+ mul);
		}
		if (ch == '/') {
			int div = num1/num2;
			System.out.println("Division of above two numbers is: "+ div);
		}
		if (ch == '%') {
			int mod = num1%num2;
			System.out.println("Modulus of above two numbers is: "+ mod);
		}
		
		System.out.println();
		System.out.println("Thank you for visiting");

	}

}
