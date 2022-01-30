/*
 	Faça um programa para a leitura de duas notas parciais de um aluno.
 	O programa deve calcular a média alcançada por aluno e apresentar:
 	
 	A mensagem "Aprovado", se a média alcançada for maior ou igual a sete.
 	A mensagem "Reprovado", se a média for menor que sete.
 	A mensagem "Aprovado com Distinção", se a média for igual a 10
 */

package com.loiane.curso.aula15;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			System.out.println("Digite a 1° Nota: ");
			double firstNote = input.nextDouble();
			
			System.out.println("Digite a 2° Nota: ");
			double secondNote = input.nextDouble();
			
			double average = (firstNote + secondNote) / 2;
			
			if(average == 10) {
				System.out.println("Aprovado com Distinção! Parabéns, sua média foi: " + average);
			} else if(average >= 7) {
				System.out.println("Aprovado, parabéns! Média: " + average);
			} else {
				System.out.println("Reprovado, média: " + average);
			}
		}

	}

}
