// Fa�a um programa que pe�a dois n�meros e imprima o maior deles.

package com.loiane.curso.aula15;

import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		
		try(Scanner input = new Scanner(System.in)) {
			
			System.out.println("Digite um n�mero: ");
			int numberOne = input.nextInt();
			
			System.out.println("Digite outro n�mero: ");
			int numberTwo = input.nextInt();
			
			if(numberOne > numberTwo) {
				System.out.println("O primeiro n�mero � maior !");
			} else if(numberOne < numberTwo) {
				System.out.println("O segundo n�mero � maior!");
			} else {
				System.out.println("Eles s�o iguais !");
			}
		}

	}

}
