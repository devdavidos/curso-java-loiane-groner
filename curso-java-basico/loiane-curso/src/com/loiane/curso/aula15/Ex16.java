package com.loiane.curso.aula15;

import java.util.Scanner;
public class Ex16 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			
			System.out.println("ax2 + bx + c");
			
			System.out.println("Qual valor de: A ?");
			int a = scan.nextInt();
			
			if(a == 0) {
				System.out.println("Não é equação de segundo grau");
			} else {
				System.out.println("Qual valor de: B ?");
				int b = scan.nextInt();
				
				System.out.println("Qual valor de: C ?");
				int c = scan.nextInt();
				
				double delta = Math.pow(b, 2) - (4*a*c);
				if(delta < 0) {
					System.out.println("Delta negativo!");
				} else {
					double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
					double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
					
					System.out.println("X1 = " + x1);
					System.out.println("X2 = " + x2);
				}
			}
		}

	}

}
