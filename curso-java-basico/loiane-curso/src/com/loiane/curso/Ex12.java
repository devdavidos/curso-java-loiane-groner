/*
  	Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu
  	peso ideal, usando a seguinte fórmula: ( 72.7* altura ) - 58
 */
package com.loiane.curso;

import java.util.Scanner;
public class Ex12 {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite a sua altura: ");
			double altura = input.nextDouble();
			
			double pesoIdeal = (72.7 * altura) - 58;
			
			System.out.println("O peso ideal é: " + pesoIdeal + "KG.");
		}
		
		

	}

}
