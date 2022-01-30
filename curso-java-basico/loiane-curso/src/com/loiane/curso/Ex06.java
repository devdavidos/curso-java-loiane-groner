// Faça um programa que peça o raio de um circulo, calcule e mostre sua área
package com.loiane.curso;

import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Insira o raio:");
			double radius = input.nextDouble();
			
			//double pi = 3.14159265359;
			 
			double area = Math.PI * Math.pow (radius, 2);
			
			System.out.println("A area é: " + area);
		}
	}

}
