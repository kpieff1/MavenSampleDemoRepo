package com.first;

public class MathOperation {

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {
		MathOperation mo = new MathOperation();
		System.out.println("Add:\t" + mo.add(5, 5));
		System.out.println("Sub:\t" + mo.sub(5, 5));
		System.out.println("Mult:\t" + mo.mul(5, 5));
	}

}
