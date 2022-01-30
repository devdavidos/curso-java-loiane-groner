package com.loiane.curso.aula15;

import java.util.Scanner;
public class Ex17 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Digite o ano: ");
			int ano = scan.nextInt();
			
			if(ano % 4 == 0) {
				System.out.println("Ano Bissexto!");
			} else {
				System.out.println("Não é ano Bissexto");
			}
		}

	}

}
