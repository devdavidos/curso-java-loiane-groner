//Fa�a um programa que leia tr�s n�meros e mostre o maior deles.

package com.loiane.curso.aula15;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			System.out.println("Digite o 1� n�mero: ");
			int numberOne = input.nextInt();
			
			System.out.println("Digite o 2� n�mero: ");
			int numberTwo = input.nextInt();
			
			System.out.println("Digite o 3� n�mero: ");
			int numberThree = input.nextInt();
			
			if(numberOne > numberTwo && numberOne > numberThree) {
				System.out.println("O primeiro n�mero � maior!");
			} else if(numberTwo > numberOne && numberTwo > numberThree) {
				System.out.println("O segundo n�mero � maior!");
			} else {
				System.out.println("O terceiro n�mero � maior!");
			}
		}

	}

}

