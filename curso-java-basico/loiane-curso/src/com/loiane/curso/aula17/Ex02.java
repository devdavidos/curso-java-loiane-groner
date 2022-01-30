package com.loiane.curso.aula17;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)) {
			
			boolean senha = false;
			
			do {
				
				System.out.println("Insira seu nome: ");
				String nomeUser = scan.next();
				
				System.out.println("Insira sua senha: ");
				String senhaUser = scan.next();
				
				if(nomeUser.equalsIgnoreCase(senhaUser)) {
					
					System.out.println("Insira uma senha diferente do nome !");
				} else {
					senha = true;
					System.out.println("Senha aprovada !");
				}
			} while(!senha);
		
			
		}
	}
}
