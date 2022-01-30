// Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número]
package com.loiane.curso;

import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
	
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite um número: ");
			int number = input.nextInt();
			
			System.out.println("O número informado foi: " + number);
		}

	}

}