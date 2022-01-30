// Faça um programa que peça dois números e imprima o maior deles.

package com.loiane.curso.aula15;

import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		
		try(Scanner input = new Scanner(System.in)) {
			
			System.out.println("Digite um número: ");
			int numberOne = input.nextInt();
			
			System.out.println("Digite outro número: ");
			int numberTwo = input.nextInt();
			
			if(numberOne > numberTwo) {
				System.out.println("O primeiro número é maior !");
			} else if(numberOne < numberTwo) {
				System.out.println("O segundo número é maior!");
			} else {
				System.out.println("Eles são iguais !");
			}
		}

	}

}
