package model;

public class Calculator {
	private Calculator() {}
	
	public static double Addition(int a, int b) { return a + b; }
	public static double Subtraction(int a, int b) { return a - b; }
	public static double Multiplication(int a, int b) { return a * b; }
	public static double Division(int a, int b) {
		if (b == 0) {
        	throw new ArithmeticException("Cannot divide by zero");
    	}
		return (double) a / b;
	}
	public static double Module(int a, int b) {
		if (b == 0) {
        	throw new ArithmeticException("Cannot divide by zero");
    	}
		return (double) a % b;
	}
}