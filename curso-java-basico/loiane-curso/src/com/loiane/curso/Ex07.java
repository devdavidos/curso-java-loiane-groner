// Fa�a um programa que calcule a �rea de um quadrado, em seguida mostre o dobro desta �rea para o �suario
package com.loiane.curso;

import java.util.Scanner;
public class Ex07 {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			System.out.println("Insira o lado do quadrado: ");
			double weight = input.nextDouble();
			
			double squadArea = Math.pow(weight, 2) * 2;
			
			System.out.println("Area do quadrado: " + squadArea / 2 + "\nO dobro da �rea: " + squadArea);
		}

	}

}