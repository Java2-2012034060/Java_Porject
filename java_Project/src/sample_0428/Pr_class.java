package sample_0428;
import java.util.Scanner;
public class Pr_class {
	Pt_class ptc = new Pt_class();
	Scanner input = new Scanner(System.in);
	void f1(){
		String op;
		int x, y, result=0;
		System.out.print("Input number 1 : ");
		x = input.nextInt();
		System.out.print("Input number 2 : ");
		y = input.nextInt();
		System.out.print("Input operation : ");
		op = input.next();
		if(op.equals("+")) result = x+y;
		else if(op.equals("-")) result = x-y;
		else if(op.equals("*")) result = x*y;
		else if(op.equals("/")) result = x/y;
		else if(op.equals("%")) result = x%y;
		else System.out.println("º´½Å");
		
		

		//System.out.println("f1");
		ptc.f3(x, y, result, op);
	}
	void f2(){
		//System.out.println("f3");
		String str1, str2;
		System.out.print("Input String1 : ");
		str1 = input.next();
		System.out.print("Input String2 : ");
		str2 = input.next();
		ptc.f3(str1.concat(str2));
	}

}
