/*
 	Fa�a um programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhasdas
 	no m�s. Calcule e mostre o total do seu sal�rio no referido m�s.
 */
package com.loiane.curso;

import java.util.Scanner;
public class Ex08 {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			System.out.println("Quanto voc� ganha por hora? ");
			double valorHora = input.nextDouble();
			
			System.out.println("Quantas horas voc� trabalhou esse m�s? ");
			double horasMes = input.nextDouble();
			
			double salario = horasMes * valorHora;
			
			System.out.println("O seu salario esse m�s �: R$ " + salario);
		}

	}

}
