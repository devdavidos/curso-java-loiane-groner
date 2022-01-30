/*
 	Faça um programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou
 	V-Vespertino ou N- Noturno. Imprima a mensagem "Bom dia!", "Boa Tarde!" ou "Boa Noite!"
 	ou "Valor Inválido", conforme o caso
 */
package com.loiane.curso.aula15;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			System.out.println("Digite qual turno você estuda.\nM- Matutirno:\nV-Vespertino:\nN-Noturno:\n==>");
			String letter = input.next();
			
			if(letter.equalsIgnoreCase("m")) {
				System.out.println("Bom dia!");
			} else if(letter.equalsIgnoreCase("v")) {
				System.out.println("Boa tarde!");
			} else if(letter.equalsIgnoreCase("n")) {
				System.out.println("Boa noite!");
			} else {
				System.out.println("Valor Inválido!");
			}
		}

	}

}
