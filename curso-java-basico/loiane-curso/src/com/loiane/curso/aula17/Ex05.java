package com.loiane.curso.aula17;

import java.util.Scanner;
public class Ex05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double popA, popB, taxaA, taxaB;
		taxaA = 3;
		taxaB = 1.5;
		
		boolean valido = false;
		
		// Inicio População A
		do {
			
			System.out.println("Entre com a população A: ");
			popA = scan.nextDouble();
			
			if(popA > 0 ) {
				valido = true;
			} else {
				System.out.println("População A precisa ser maior que 0.");
			}
		} while(!valido);
		// Fim População B
		
		// Inicio População A
		valido = false;
		
		do {
			
			System.out.println("Entre com a população B: ");
			popB = scan.nextDouble();
			
			if(popB > 0 ) {
				valido = true;
			} else {
				System.out.println("População B precisa ser maior que 0.");
			}
		} while(!valido);
		// Fim População B
		
		int count = 0;
		
		while(popA < popB) {
			popA += (popA / 100) * taxaA;
			popB += (popB / 100) * taxaB;
			count++;
		}
		
		System.out.println("População A: " + popA);
		System.out.println("População B: " + popB);
		System.out.println("Quantos anos: " + count);
		
	}

}
