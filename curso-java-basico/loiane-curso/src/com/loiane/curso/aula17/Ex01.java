package com.loiane.curso.aula17;

import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)) {
			
			boolean notaValida = false;
			
			do {
			System.out.println("Digite um n�mero entre 1 e 10");
			int nota = scan.nextInt();
			
			if(nota >=0 && nota <= 10) {
				System.out.println("Voc� digitou: " + nota);
			} else {
				System.out.println("Nota inv�lida!");
					
			}
			
			} while(!notaValida);
			
			}

	}

}
