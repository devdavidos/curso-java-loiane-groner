/*
 	Faça um programa que faça 5 perguntas para uma pessoa sobre um crime.
 	As perguntas são:
 	"Telefone para a vítima?"
 	B: "Esteve no local do crime?"
 	
 */
package com.loiane.curso.aula15;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)) {
		
		System.out.println("Digite 1- Sim e 2-não");
		
		System.out.println("Telefonou para a vítima? ");
		int telefonou = scan.nextInt();
		
		System.out.println("Esteve no local do crime? ");
		int esteveNoLocal = scan.nextInt();
		
		System.out.println("Mora perto da vítima? ");
		int moraPerto = scan.nextInt();
		
		System.out.println("Devia para a vítima? ");
		int devia = scan.nextInt();
		
		System.out.println("Já trabalhou com a vítima? ");
		int trabalhouJunto = scan.nextInt();
		
		int total = telefonou + esteveNoLocal + moraPerto + devia + trabalhouJunto;
		
		if(total == 2) {
			System.out.println("Pessoa Suspeita!");
		} else if(total >=3 && total <= 4) {
			System.out.println("Essa pessoa é possivelmente Cúmplice.");
		} else if(total >= 5) {
			System.out.println("Assassino! Algúem o algeme.");
		} else {
			System.out.println("Inocente!");
		}
		
		}

	}

}
