/*
 	Fa�a um programa que pe�a um n�mero inteiro e determine se ele � par ou impar. Dica: uti
 	lize o operador m�dulo (Resto da divis�o).
 */
package com.loiane.curso.aula15;

import java.util.Scanner;
public class Ex18 {

	public static void main(String[] args) {
	
		try(Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Insira um n�mero: ");
			int number = scan.nextInt();
			
			if(number % 2 == 0) {
				System.out.println("� par: " + number);
			} else {
				System.out.println("� impar: " + number);
			}
			
		}
	}

}
