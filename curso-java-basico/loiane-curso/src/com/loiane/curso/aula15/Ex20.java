/*
 	Fa�a um programa que fa�a 5 perguntas para uma pessoa sobre um crime.
 	As perguntas s�o:
 	"Telefone para a v�tima?"
 	B: "Esteve no local do crime?"
 	
 */
package com.loiane.curso.aula15;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)) {
		
		System.out.println("Digite 1- Sim e 2-n�o");
		
		System.out.println("Telefonou para a v�tima? ");
		int telefonou = scan.nextInt();
		
		System.out.println("Esteve no local do crime? ");
		int esteveNoLocal = scan.nextInt();
		
		System.out.println("Mora perto da v�tima? ");
		int moraPerto = scan.nextInt();
		
		System.out.println("Devia para a v�tima? ");
		int devia = scan.nextInt();
		
		System.out.println("J� trabalhou com a v�tima? ");
		int trabalhouJunto = scan.nextInt();
		
		int total = telefonou + esteveNoLocal + moraPerto + devia + trabalhouJunto;
		
		if(total == 2) {
			System.out.println("Pessoa Suspeita!");
		} else if(total >=3 && total <= 4) {
			System.out.println("Essa pessoa � possivelmente C�mplice.");
		} else if(total >= 5) {
			System.out.println("Assassino! Alg�em o algeme.");
		} else {
			System.out.println("Inocente!");
		}
		
		}

	}

}
