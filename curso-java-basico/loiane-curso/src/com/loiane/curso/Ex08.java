/*
 	Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhasdas
 	no mês. Calcule e mostre o total do seu salário no referido mês.
 */
package com.loiane.curso;

import java.util.Scanner;
public class Ex08 {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			System.out.println("Quanto você ganha por hora? ");
			double valorHora = input.nextDouble();
			
			System.out.println("Quantas horas você trabalhou esse mês? ");
			double horasMes = input.nextDouble();
			
			double salario = horasMes * valorHora;
			
			System.out.println("O seu salario esse mês é: R$ " + salario);
		}

	}

}
