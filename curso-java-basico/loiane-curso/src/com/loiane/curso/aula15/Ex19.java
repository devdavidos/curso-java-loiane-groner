package com.loiane.curso.aula15;

import java.util.Scanner;
public class Ex19 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Digite o 1° número: ");
			int numberOne = scan.nextInt();
			
			System.out.println("Digite o 2° número: ");
			int numberTwo = scan.nextInt();
			
			System.out.println("Qual operação você deseja realizar? + , - , x , /");
			String operation = scan.next();
			
			double result = 0;
			boolean valida = true;
			
			switch(operation) {
			case "+":
				result = numberOne + numberTwo;
				break;
			case "-":
				result = numberOne - numberTwo;
				break;
			case "*":
				result = numberOne * numberTwo;
				break;
			case "/":
				result = numberOne / numberTwo;
				break;
			default:
				System.out.println("Operação inválida !");
				valida = false;
				
			}
			
			if(valida) {
				
				System.out.println("Resultado: " + result);
				
				if(result >= 0) {
					
					System.out.println("Resultado Positivo!");
				} else {
					
					System.out.println("Resultado Negativo!");
				}
				
				if(result % 2 == 0) {
					
					System.out.println("Resultado par");
				} else {
					
					System.out.println("Resultado Impar");
				}
			}

		}
	}

}
