/*
  	Fa�a um programa que verifique se uma letra digitada � "F" ou "M" conforme a letra escrever
  	F femenino e M masculino ou Sexo invalido
 */

package com.loiane.curso.aula15;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			System.out.println("Digite o sexo: M - Masculino ou F - Femenino.");
			String gender = input.nextLine();
			
			if(gender.equalsIgnoreCase("M")) {
				System.out.println("Voc� digito " + gender + " de Masculino!");
			} else if(gender.equalsIgnoreCase("F")) {
				System.out.println("Voc� digitou " + gender + " de Feminino.");
			} else {
				System.out.println("Sexo Inv�lido!");
			}
		}

	}

}
