import java.util.*;
public class CharCalc {

	public static void main(String[] args) {
		System.out.println("Make your arithmetic selection from the choices below:");
		System.out.println("A. Addition");
		System.out.println("S. Subtraction");
		System.out.println("M. Multiplication");
		System.out.println("D. Division");
		System.out.print("Your choice? ");
		Scanner choice=new Scanner(System.in);
		String C= choice.nextLine();
		char dec=C.charAt(0);
		
		Scanner maths=new Scanner(System.in);
		System.out.print("Print your operands separated by a space: ");
		double math1=maths.nextDouble();
		double math2=maths.nextDouble();
		
		switch(dec){
		
		case 'a':
		case 'A':
			System.out.println(math1 + " plus " + math2 + " = " + (math1+math2));
		break;
		case 's':
		case 'S':
			System.out.println(math1 + " minus " + math2 + " = " + (math1-math2));
		break;
		case 'm':
		case 'M':
			System.out.println(math1 + " multiplied by " + math2 + " = " + (math1*math2));
		break;
		case 'd':
		case 'D':
			System.out.println(math1 + " divided by " + math2 + " = " + (math1/math2));
		break;
		
		}

	}

}
