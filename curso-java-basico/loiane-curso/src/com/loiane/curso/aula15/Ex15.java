/*
  Faça um programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem
  ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
  escaleno.
  
  Dicas:
  - três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro.
  - triângulo equilátero: três lados iguais.
  - triângulo isósceles: quaisquer dois lados iguais.
  - triângulo escaleno: três lados diferentes.
 */
package com.loiane.curso.aula15;

import java.util.Scanner;
public class Ex15 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Lado 1 do triângulo: ");
			double ladoUm = scan.nextDouble();
			
			System.out.println("Lado 2 do triângulo: ");
			double ladoDois = scan.nextDouble();
			
			System.out.println("Lado 3 do triângulo: ");
			double ladoTres = scan.nextDouble();
			
			if(ladoUm == ladoDois && ladoUm == ladoTres) {
				System.out.println("Triângulo: Equilátero");
			} else if(ladoUm == ladoDois || ladoUm == ladoTres || ladoDois == ladoTres) {
				System.out.println("Triângulo: Isósceles");
			} else {
				System.out.println("Triângulo: Escaleno");
			}
			
		}

	}

}
