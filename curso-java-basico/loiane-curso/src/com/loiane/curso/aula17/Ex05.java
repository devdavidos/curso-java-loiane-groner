package com.loiane.curso.aula17;

import java.util.Scanner;
public class Ex05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double popA, popB, taxaA, taxaB;
		taxaA = 3;
		taxaB = 1.5;
		
		boolean valido = false;
		
		// Inicio Popula��o A
		do {
			
			System.out.println("Entre com a popula��o A: ");
			popA = scan.nextDouble();
			
			if(popA > 0 ) {
				valido = true;
			} else {
				System.out.println("Popula��o A precisa ser maior que 0.");
			}
		} while(!valido);
		// Fim Popula��o B
		
		// Inicio Popula��o A
		valido = false;
		
		do {
			
			System.out.println("Entre com a popula��o B: ");
			popB = scan.nextDouble();
			
			if(popB > 0 ) {
				valido = true;
			} else {
				System.out.println("Popula��o B precisa ser maior que 0.");
			}
		} while(!valido);
		// Fim Popula��o B
		
		int count = 0;
		
		while(popA < popB) {
			popA += (popA / 100) * taxaA;
			popB += (popB / 100) * taxaB;
			count++;
		}
		
		System.out.println("Popula��o A: " + popA);
		System.out.println("Popula��o B: " + popB);
		System.out.println("Quantos anos: " + count);
		
	}

}
