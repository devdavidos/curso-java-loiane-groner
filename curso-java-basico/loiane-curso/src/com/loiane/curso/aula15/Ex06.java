//Faça um programa que leia três números e mostre o maior deles.

package com.loiane.curso.aula15;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			System.out.println("Digite o 1° número: ");
			int numberOne = input.nextInt();
			
			System.out.println("Digite o 2° número: ");
			int numberTwo = input.nextInt();
			
			System.out.println("Digite o 3° número: ");
			int numberThree = input.nextInt();
			
			if(numberOne > numberTwo && numberOne > numberThree) {
				System.out.println("O primeiro número é maior!");
			} else if(numberTwo > numberOne && numberTwo > numberThree) {
				System.out.println("O segundo número é maior!");
			} else {
				System.out.println("O terceiro número é maior!");
			}
		}

	}

}

