// Faça um Programa que leia três números e mostre-os em ordem decrescente.
package com.loiane.curso.aula15;

import java.util.Scanner;

public class Ex09 {
	
    public static void main(String[] args) {
    	try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite o 1° número: ");
			int numberOne = input.nextInt();
			
			System.out.println("Digite o 2° número: ");
			int numberTwo = input.nextInt();
			
			System.out.println("Digite o 3° número: ");
			int numberThree = input.nextInt();
			
			if(numberOne > numberTwo && numberTwo > numberThree) {
				
				System.out.println("Ordem: " + numberOne + ", " + numberTwo + ", " + numberThree);
			} else if(numberOne > numberThree && numberThree > numberTwo) {
				
				System.out.println("Ordem: " + numberOne + ", " + numberThree + ", " + numberTwo);
			} else if(numberTwo > numberOne && numberOne > numberThree) {
				
				System.out.println("Orgem: " + numberTwo + ", " + numberOne + ", " + numberThree);
			} else if(numberTwo > numberThree && numberThree > numberTwo) {
				
				System.out.println("Orgem: " + numberTwo + ", " + numberThree + ", " + numberOne);
			} else if(numberThree > numberOne && numberOne > numberTwo) {
				
				System.out.println("Orgem: " + numberThree + ", " + numberOne + ", " + numberTwo);
			} else if(numberThree > numberTwo && numberTwo > numberOne) {
				
				System.out.println("Orgem: " + numberThree + ", " + numberTwo + ", " + numberOne);
			} else {
				
				System.out.println("Orgem: Invalída!");
			}
		}
    }
}