/*
 	Faça um programa que leia um número e exiba o dia correspondente da semana. (1- Domingo, 2- Segunda, etc)
 	se digitar outro valor deve aparecer valor inváli0do
 */
package com.loiane.curso.aula15;

import java.util.Scanner;
public class Ex13 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			
			System.out.println("1- Domingo, 2- Segunda, 3- Terça, 4- Quarta, 5- Quinta, 6- Sexta, 7- Sabádo");
			int diaSemana = scan.nextInt();
			
			switch(diaSemana) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda-feira!");
				break;
			case 3:
				System.out.println("Terça-feira!");
				break;
			case 4:
				System.out.println("Quarta-feira!");
				break;
			case 5:
				System.out.println("Quinta-feira!");
				break;
			case 6:
				System.out.println("Sexta-feira!");
				break;
			case 7:
				System.out.println("Sabádo!");
				break;
				default:
					System.out.println("Valor Inválido!");
			}
		}

	}

}
