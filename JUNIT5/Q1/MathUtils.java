package io.JUnit5;

public class MathUtils {
	
	//ADDITION
	public int add(int a, int b) {
		
		return a+b;
	}
	
	//SUBSTRACTION
	public int sub(int a, int b) {
		
		return a-b;
	}
	
	//MULTIPLY
    public int mul(int a, int b) {
		
		return a*b;
	}
    
    //DIVIDE
    public int div(int a, int b) {
		
		return a/b;
	}
	
    //AREA OF A CIRCLE
	public double computeCircleArea(double radius) {
		
		return Math.PI * radius *radius;
	}
	
	
	/*
	 public static void main(String[] args) {
		MathUtils mathUtils = new MathUtils();
		System.out.println(mathUtils.computeCircleArea(10));
		
	} */

}