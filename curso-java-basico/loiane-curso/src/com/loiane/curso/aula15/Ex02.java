// Fa�a um programa que pe�a um valor e mostre na tela se o valor � positivo ou negativo
package com.loiane.curso.aula15;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			System.out.println("Digite um n�mero: ");
			int number = input.nextInt();
			
			if(number >= 0) {
				System.out.println("O n�mero: " + number + " � positivo!");
			} else {
				System.out.println("O n�mero: " + number + " � negativo!");
			
			}
		}

	}

}
