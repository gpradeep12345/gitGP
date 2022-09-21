package Interface;

import java.util.Scanner;
public class Calculator implements InterfaceCalculator {
	@Override
	public int add(int a, int b) {
		int add = a+b;
		System.out.println("addition : "+add);
		return add;
	}
	@Override
	public int subtract(int a, int b) {
		int sub = a-b;
		System.out.println("subtraction : "+sub);
		return sub;	
	}
	@Override
	public int mutiply(int a, int b) {
		int multi = a*b;
		System.out.println("multiplication : "+multi);
		return multi;		
	}

	@Override
	public int divide(int a, int b) {
		int div = a/b;
		System.out.println("divide : "+div);
		return div;	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("value of a :");
		int a = sc.nextInt();
		System.out.println(a);
		System.out.println("value of b :");
		int b = sc.nextInt();
		System.out.println(b);
		Calculator cal = new Calculator();
		cal.add(a, b);
		cal.subtract(a, b);
		cal.mutiply(a, b);
		cal.divide(a, b);
		
	}

}
