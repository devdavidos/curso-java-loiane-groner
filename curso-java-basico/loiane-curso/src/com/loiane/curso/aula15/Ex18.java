/*
 	Faça um programa que peça um número inteiro e determine se ele é par ou impar. Dica: uti
 	lize o operador módulo (Resto da divisão).
 */
package com.loiane.curso.aula15;

import java.util.Scanner;
public class Ex18 {

	public static void main(String[] args) {
	
		try(Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Insira um número: ");
			int number = scan.nextInt();
			
			if(number % 2 == 0) {
				System.out.println("É par: " + number);
			} else {
				System.out.println("É impar: " + number);
			}
			
		}
	}

}
