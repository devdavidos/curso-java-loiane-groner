// Fa�a um programa que verefique se a letra digitada � vogal ou consoante.

package com.loiane.curso.aula15;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			System.out.println("Digite uma letra: ");
			String letra = input.next();
			
			switch(letra) {
				case "a":
				case "A":
				case "e":
				case "E":
				case "i":
				case "I":
				case "o":
				case "O":
				case "u":
				case "U":
					System.out.println("� vogal.");
					break;
				default:
					System.out.println("� consoante!");
			}
		}

	}

}
