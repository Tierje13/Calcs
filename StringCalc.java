import java.util.Scanner;


public class StringCalc {

	public static void main(String[] args) {
		System.out.println("Make your arithmetic selection from the choices below:");
		System.out.println("Addition");
		System.out.println("Subtraction");
		System.out.println("Multiplication");
		System.out.println("Division");
		System.out.print("Your choice? ");
		Scanner choice=new Scanner(System.in);
		String C= choice.nextLine();
		
		
		Scanner maths=new Scanner(System.in);
		System.out.print("Print your operands separated by a space: ");
		double math1=maths.nextDouble();
		double math2=maths.nextDouble();
		
		switch(C.toLowerCase()){
		
		case "addition":
		
			System.out.println(math1 + " plus " + math2 + " = " + (math1+math2));
		break;
		case "subtraction":
		
			System.out.println(math1 + " minus " + math2 + " = " + (math1-math2));
		break;
		case "multiplication":
		
			System.out.println(math1 + " multiplied by " + math2 + " = " + (math1*math2));
		break;
		case "division":
		
			System.out.println(math1 + " divided by " + math2 + " = " + (math1/math2));
		break;

	}

}
}
