package com.loiane.curso.aula15;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Nota do 1° Bimestre: ");
			double firstNote = scan.nextDouble();
			
			System.out.println("Nota do 2° Bimistre: ");
			double secondNote = scan.nextDouble();
			
			double average = (firstNote + secondNote) / 2;
			
			if(average >= 9) {
				
				System.out.println("Média: " + average + "\nConteito: A\nAprovado!");
			} else if(average < 9 && average >= 7.5) {
				
				System.out.println("Média: " + average + "\nConceito: B\nAprovado!");
			} else if(average < 7.5 && average >= 6) {
				System.out.println("Média: " + average + "\nConceito: C\nReprovado!");
			} else if(average < 6 && average >= 4) {
				System.out.println("Média: " + average + "\nConceito: D\nReprovado!");
			} else {
				System.out.println("Média: " + average + "\nConceito: E\nAprovado!");
			}
		}
		

	}

}
