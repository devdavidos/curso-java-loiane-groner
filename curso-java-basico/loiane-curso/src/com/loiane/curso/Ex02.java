// Fa�a um Programa que pe�a um n�mero e ent�o mostre a mensagem O n�mero informado foi [n�mero]
package com.loiane.curso;

import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
	
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite um n�mero: ");
			int number = input.nextInt();
			
			System.out.println("O n�mero informado foi: " + number);
		}

	}

}