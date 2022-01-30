// Faça um programa que leia três números e mostre o maior e o menor deles.
package com.loiane.curso.aula15;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			System.out.println("Digite o 1° número: ");
			int numberOne = input.nextInt();
			
			System.out.println("Digite o 2° número: ");
			int numberTwo = input.nextInt();
			
			System.out.println("Digite o 3° número: ");
			int numberThree = input.nextInt();
			
			if(numberOne > numberTwo && numberOne > numberThree && numberTwo > numberThree) {
				System.out.println("O primeiro é o maior! O terceiro é o menor!");
			} else if(numberOne > numberTwo && numberOne > numberThree && numberTwo < numberThree) {
				System.out.println("O primeiro é o maior! O segundo é o menor!");
			} else if(numberTwo > numberOne && numberTwo > numberThree && numberOne > numberThree) {
				System.out.println("O segundo é o maior! O terceiro é o menor!");
			} else if(numberTwo > numberOne && numberTwo > numberThree && numberThree > numberOne) {
				System.out.println("O segundo é o maior! O primeiro é o menor!");
			} else if(numberThree > numberTwo && numberThree > numberOne && numberTwo > numberOne) {
				System.out.println("O terceiro é o maior! O primeiro é o menor!");
			} else if(numberThree > numberTwo && numberThree > numberOne && numberTwo < numberOne) {
				System.out.println("O terceiro é o maior! O segundo é o menor!");
			}
			
			}
		}

	}

