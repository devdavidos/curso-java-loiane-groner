package com.loiane.curso.aula15;

import java.util.Scanner;
public class Ex22 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Peso do Morango: ");
			double pesoMorango = scan.nextDouble();
			
			System.out.println("Peso da Maça: ");
			double pesoMaca = scan.nextDouble();
			
			double valorMorango = 0;
			if(pesoMorango <= 5) {
				valorMorango = 2.5;
			} else {
				valorMorango = 2.2;
			}
			
			double valorMaca = 0;
			if(pesoMaca <= 5) {
				 valorMaca = 1.8;
			} else {
				valorMaca = 1.5;
			}
			
			double precoTotalMorango = pesoMorango * valorMorango;
			double precoTotalMaca = pesoMaca * valorMaca;
			
			double precoParcial = precoTotalMorango + precoTotalMaca;
			double precoTotal = 0;
			
			if(pesoMorango + pesoMaca > 8 || precoParcial > 25) {
				precoTotal = (precoParcial / 100) * 10;
				System.out.println("Preço total: R$ " + precoTotal);
			} else {
				System.out.println("Preço total: R$ " + precoParcial);
			}
		} 
	}

}
