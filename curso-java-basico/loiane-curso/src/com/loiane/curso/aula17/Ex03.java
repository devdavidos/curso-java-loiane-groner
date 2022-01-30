package com.loiane.curso.aula17;

import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean infoValida = false; // Declaração da Flag
		
		String nome, sexo, estadoCivil;
		int idade;
		double salario;
		
		// Inicio Nome
		
		do {
			
			System.out.println("Entre com o nome: ");
			nome = scan.next();
			
			if(nome.length() >= 3) {
				infoValida = true;
			} else {
				System.out.println("Nome precisa no mínimo 3 caracteres.");
			}
			
		} while(!infoValida);
		// Fim Nome
		
		// Inicio Idade
		
		infoValida = false;
		
		do {
			
			System.out.println("Entre com a Idade: ");
			idade = scan.nextInt();
			
			if(idade >= 0 && idade <= 150) {
				infoValida = true;
			} else {
				System.out.println("Idade precisa ser entre 0 e 150.");
			}
			
		} while(!infoValida);
		// Fim Idade
		
		
		// Inicio Salario
		
		infoValida = false;
		
		do {
			
			System.out.println("Entre com o salário: ");
			salario = scan.nextDouble();
			
			if(salario > 0) {
				infoValida = true;
			} else {
				System.out.println("Salário precisa ser maior que 0.");
			}
			
		} while(!infoValida);
		// Fim Salario
		
		// Inicio Sexo
		
		infoValida = false;
		
		do {
			
			System.out.println("Entre com o genero: ");
			sexo = scan.next();
			
			if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				infoValida = true;
			} else {
				System.out.println("Sexo precisa ser F ou M.");
			}
			
		} while(!infoValida);
		
		// Inicio Estado Civil
		
		infoValida = false;
		
		do {
			
			System.out.println("Entre com o estado civil: ");
			estadoCivil = scan.next();
			
			if(estadoCivil.equalsIgnoreCase("s") ||
					estadoCivil.equalsIgnoreCase("c") ||
					estadoCivil.equalsIgnoreCase("v") ||
					estadoCivil.equalsIgnoreCase("d")
					) {
				infoValida = true;
				
			} else {
				System.out.println("Estado Civil precisa ser 's','c','v' ou 'd'");
			}
			
		} while(!infoValida);
		// Fim Estado Civil
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);
		
		//fim do algoritmo
	}

}
