/*
  Fa�a um programa que pe�a os 3 lados de um tri�ngulo. O programa dever� informar se os valores podem
  ser um tri�ngulo. Indique, caso os lados formem um tri�ngulo, se o mesmo �: equil�tero, is�sceles ou
  escaleno.
  
  Dicas:
  - tr�s lados formam um tri�ngulo quando a soma de quaisquer dois lados for maior que o terceiro.
  - tri�ngulo equil�tero: tr�s lados iguais.
  - tri�ngulo is�sceles: quaisquer dois lados iguais.
  - tri�ngulo escaleno: tr�s lados diferentes.
 */
package com.loiane.curso.aula15;

import java.util.Scanner;
public class Ex15 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Lado 1 do tri�ngulo: ");
			double ladoUm = scan.nextDouble();
			
			System.out.println("Lado 2 do tri�ngulo: ");
			double ladoDois = scan.nextDouble();
			
			System.out.println("Lado 3 do tri�ngulo: ");
			double ladoTres = scan.nextDouble();
			
			if(ladoUm == ladoDois && ladoUm == ladoTres) {
				System.out.println("Tri�ngulo: Equil�tero");
			} else if(ladoUm == ladoDois || ladoUm == ladoTres || ladoDois == ladoTres) {
				System.out.println("Tri�ngulo: Is�sceles");
			} else {
				System.out.println("Tri�ngulo: Escaleno");
			}
			
		}

	}

}
