// Faça um programa que converta metros para centimetros
package com.loiane.curso;

import java.util.Scanner;
public class Ex05 {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Qual o tamanho em metros: ");
			double metres = input.nextDouble();
			
			double centimetres = metres * 100;
			
			System.out.println("O tamanho em metros é: " + metres + "m, convertido em centimetros é: " + centimetres + "cm!");
		}
	}

}
