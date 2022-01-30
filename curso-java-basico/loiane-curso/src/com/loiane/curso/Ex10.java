/*
 	Fa�a um programa que pe�a a temperatura em graus Celsius, transforme e mostre em graus Farenheit.
 */

package com.loiane.curso;

import java.util.Scanner;
public class Ex10 {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("A temperatura em Celsius �: ");
			double celsius = input.nextDouble();
			
			double farenheit = ((celsius * 9) / 5) + 32;
			
			System.out.println("A temperatura em Farenheit �: " + farenheit + " F�.");
		}
	}

}
