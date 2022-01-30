// Faça um Programa que peça dois números e imprima a soma.  
package com.loiane.curso;

import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
	
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite um número: ");
			int numberOne = input.nextInt();
			
			System.out.println("Digite outro número: ");
			int numberTwo = input.nextInt();
			
			int sum = numberOne + numberTwo;
			
			System.out.println("A soma entre: " + numberOne + " + " + numberTwo + " = " + sum);
		}

	}

}