package com.loiane.curso.aula15;

import java.util.Scanner;
public class Ex23 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Escolha 1- File Duplo, 2- Alcatra, 3- Picanha");
			double escolha = scan.nextDouble();
			
			System.out.println("Quantos kilos: ");
			double quantidade = scan.nextDouble();
			
			double precoKG = 0;
			
			if(escolha == 1) {
				System.out.println(quantidade + " kg, de - filé duplo!");
				if(quantidade <= 5) {
					precoKG = 4.9;
				} else {
					precoKG = 5.8;
				}
			}
			
			if(escolha == 2) {
				System.out.println(quantidade + " kg, de - Alcatra!");
				if(quantidade <= 5) {
					precoKG = 5.90;
				} else {
					precoKG = 6.80;
				}
			}
			
			if(escolha == 3) {
				System.out.println(quantidade + " kg, de - filé Picanha!");
				if(quantidade <= 5) {
					precoKG = 6.9;
				} else {
					precoKG = 7.8;
				}
			}
			
			double total = quantidade * precoKG;
			System.out.println("Total: R$" + total);
			
			System.out.println("Compra no Cartão? 1- Sim 2- Não");
			int cartao = scan.nextInt();
			
			if(cartao == 1) {
				double desconto = (total / 100) * 5;
				System.out.println("Desconto de 5% R$ " + desconto);
				System.out.println("Valor a pagar R$ " + (total - desconto));
			} else {
				System.out.println("Não é no cartão!");
			}
		}

	}

}
