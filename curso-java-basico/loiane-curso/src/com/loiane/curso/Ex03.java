// Fa�a um Programa que pe�a dois n�meros e imprima a soma.  
package com.loiane.curso;

import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
	
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite um n�mero: ");
			int numberOne = input.nextInt();
			
			System.out.println("Digite outro n�mero: ");
			int numberTwo = input.nextInt();
			
			int sum = numberOne + numberTwo;
			
			System.out.println("A soma entre: " + numberOne + " + " + numberTwo + " = " + sum);
		}

	}

}