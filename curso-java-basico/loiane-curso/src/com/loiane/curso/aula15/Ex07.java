// Fa�a um programa que leia tr�s n�meros e mostre o maior e o menor deles.
package com.loiane.curso.aula15;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			System.out.println("Digite o 1� n�mero: ");
			int numberOne = input.nextInt();
			
			System.out.println("Digite o 2� n�mero: ");
			int numberTwo = input.nextInt();
			
			System.out.println("Digite o 3� n�mero: ");
			int numberThree = input.nextInt();
			
			if(numberOne > numberTwo && numberOne > numberThree && numberTwo > numberThree) {
				System.out.println("O primeiro � o maior! O terceiro � o menor!");
			} else if(numberOne > numberTwo && numberOne > numberThree && numberTwo < numberThree) {
				System.out.println("O primeiro � o maior! O segundo � o menor!");
			} else if(numberTwo > numberOne && numberTwo > numberThree && numberOne > numberThree) {
				System.out.println("O segundo � o maior! O terceiro � o menor!");
			} else if(numberTwo > numberOne && numberTwo > numberThree && numberThree > numberOne) {
				System.out.println("O segundo � o maior! O primeiro � o menor!");
			} else if(numberThree > numberTwo && numberThree > numberOne && numberTwo > numberOne) {
				System.out.println("O terceiro � o maior! O primeiro � o menor!");
			} else if(numberThree > numberTwo && numberThree > numberOne && numberTwo < numberOne) {
				System.out.println("O terceiro � o maior! O segundo � o menor!");
			}
			
			}
		}

	}

