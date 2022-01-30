// Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo
package com.loiane.curso.aula15;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			System.out.println("Digite um número: ");
			int number = input.nextInt();
			
			if(number >= 0) {
				System.out.println("O número: " + number + " é positivo!");
			} else {
				System.out.println("O número: " + number + " é negativo!");
			
			}
		}

	}

}
