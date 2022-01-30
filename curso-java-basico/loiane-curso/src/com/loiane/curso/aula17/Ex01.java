package com.loiane.curso.aula17;

import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)) {
			
			boolean notaValida = false;
			
			do {
			System.out.println("Digite um número entre 1 e 10");
			int nota = scan.nextInt();
			
			if(nota >=0 && nota <= 10) {
				System.out.println("Você digitou: " + nota);
			} else {
				System.out.println("Nota inválida!");
					
			}
			
			} while(!notaValida);
			
			}

	}

}
