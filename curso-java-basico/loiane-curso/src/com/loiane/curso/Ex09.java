/*
 	Fa�a um programa que pe�a a temperatura em graus Farenheit, transforme e mostre a 
 	temperatura em graus Farenheit
  
 */
package com.loiane.curso;

import java.util.Scanner;
public class Ex09 {
	
	public static void main (String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			System.out.println("A temperatura atual em Farenheit �: ");
			double farenheit = input.nextDouble();
			
			double celsius = (5 * (farenheit - 32)) / 9;
			
			System.out.println("A temperatura convertida em Celcius �: " + celsius + "C�.");
		}
		
	}
	
	

}
