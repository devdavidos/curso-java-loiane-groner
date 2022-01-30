// Faça um program que peça quatro notas bimestrais e mostre a media
package com.loiane.curso;

import java.util.Scanner;
public class Ex04 {
	
	public static void main (String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Nota 1° Semestre: ");
			double firstNote = input.nextDouble();
			
			System.out.println("Nota 2° Semestre: ");
			double secondNote = input.nextDouble();
			
			System.out.println("Nota 3° Semestre: ");
			double thirdNote = input.nextDouble();
			
			System.out.println("Nota 4° Semestre: ");
			double fourthNote = input.nextDouble();
			
			double average = (firstNote + secondNote + thirdNote + fourthNote) / 4;
			
			System.out.println("A média total é: " + average);
		}
	}
}
