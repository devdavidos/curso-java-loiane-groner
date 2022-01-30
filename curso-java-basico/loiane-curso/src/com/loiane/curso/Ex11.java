/*
 	Fa�a um programa que pe�a 2 n�meros inteiros e um n�mero real.
 	
 	Calcule e mostre:
 	
 	A. O produto do dobro do primeiro com metade do segundo.
 	B. A soma do triplo do primeiro com o terceiro.
 	C. O terceiro elevado ao cubo.
 	
 */
package com.loiane.curso;

import java.util.Scanner;
public class Ex11 {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			System.out.println("Digite o primeiro n�mero (inteiro): ");
			int numberOne = input.nextInt();
			
			System.out.println("Digite o segundo n�mero (inteiro):");
			int numberTwo = input.nextInt();
			
			System.out.println("Digite o terceiro n�mero (ponto flutuante): ");
			double numberThree = input.nextDouble();
			
			int A = (numberOne * 2) + (numberTwo / 2);
			double B = ((numberOne * 3) + numberThree);
			double C = Math.pow(numberThree, 3);
			
			System.out.println("O dobro do primeiro com a metade do segundo: " + A);
			System.out.println("A soma do triplo do primeiro com o terceiro: " + B); 
			System.out.println("O terceiro elevado ao cubo: " + C);
		}
	}

}